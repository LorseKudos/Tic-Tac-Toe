package io.github.lorsekudos.marubatsu

import io.github.lorsekudos.marubatsu.board.{CellState, Empty, Maru => MaruState, Batsu => BatsuState}

package object game {
    private[marubatsu] def toWinner(cellState: CellState): Winner = cellState match {
        case Empty => NoWinner
        case MaruState => Maru
        case BatsuState => Batsu
    }
}
