package com.testb;

public sealed class TestSealed permits son { // 这个类必须有子类,子类必须是 sealed、non-sealed 或 final 修饰符。
}

final class son extends TestSealed{

}
