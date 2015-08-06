package org.apache.mesos.chronos.scheduler.mesos

import akka.actor.ActorRef

object MesosOfferReviverDelegate {
  case object ReviveOffers
}

class MesosOfferReviverDelegate(offerReviverRef: ActorRef) extends MesosOfferReviver {
  override def reviveOffers(): Unit = offerReviverRef ! MesosOfferReviverDelegate.ReviveOffers
}
