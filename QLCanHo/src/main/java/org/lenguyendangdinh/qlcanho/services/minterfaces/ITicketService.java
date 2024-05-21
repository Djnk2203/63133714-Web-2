package org.lenguyendangdinh.qlcanho.services.minterfaces;

import org.lenguyendangdinh.qlcanho.models.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface ITicketService extends CrudRepository<Ticket, Integer> {
}
