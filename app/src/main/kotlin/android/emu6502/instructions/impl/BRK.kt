package android.emu6502.instructions.impl

import android.emu6502.CPU
import android.emu6502.instructions.BaseInstruction
import android.emu6502.instructions.Instruction

/** BRreaK */
final class BRK(private val cpu: CPU) : BaseInstruction(Instruction.BRK, cpu.instructionList) {
  override fun single() {
    cpu.stop()
  }
}