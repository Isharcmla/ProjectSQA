package org.apache.commons.codec.language;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Soundex_soundex_87825792250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161759;

    public Soundex_soundex_87825792250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161759 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\\ \uFFC0\uFFDB{@@  \u001B\uFFC0 @@@{@  \u001C\uFFC0\uFFD8\u0018\uFFC0|`{@\uFFC0@`\uFFC0`{|\uFF9C\uFFDB \uFFDB\uFFDC\uFFDB\uFFC0[\uFFC0\uFF83\\{\uFFDC ||\uFF83 |`@\\\uFFC0\uFFC0@\uFFC0\uFFDB`[\uFFC0@`[@\uFFC0\u001B {`\u001B \uFFE0{\uFF80` #@ \uFFC0|\uFF9C`|@\uFFC0 {@  \u000B\uFF9C@\\[[\u001B||\u001C\uFF9B\uFF80\u001B\u001C\u001B| \u001C\uFFC0[\u001C@\uFFC0\uFFC0{  |\\||{@\uFFDC@\uFF9C\uFFC0\uFFC0@ | `\\\\[\uFFA0\uFFC0@\uFFA0\uFFC0`|\uFFC0   \uFF9C {`\uFF9C @\u000B@\uFFC0|@@[@ \uFFC0\uFFC0 \uFFE0@@ |\u001B[{ |`\uFFC0 {|{\uFFA0 \uFFDB\uFFC0@{\u001B\u001B\uFF80[\u001B \uFFBC  \uFF9B   {\u001C@ \uFF9C\u001B  \u001C \uFF80\u001C  {\u001C{{{{\uFFA0@@\u001B@\uFF9C\uFF9B\uFF9C\uFFC0\uFFE0\uFFA0 \uFFDC\uFF9B[@\uFFC0\uFFC0@\uFFC0[\uFFC0\uFFA0\uFFA0\uFFC0@@@\uFF9B\uFFDC\uFFC0\uFFDC\uFF9C\uFF9C\uFF9C\uFFC0\uFFC0\uFFC0\uFFE0\uFFC0\uFFC0\uFFC0\uFFDB\uFF9C\uFFC0\uFFC0\uFFDB\uFFC0\uFFC0\uFFC0\uFFDB\uFFE0\uFFC0\uFFC0\uFFC0\uFF9C\uFFC0\uFFDC\uFFC0\uFF9C\uFFDC\uFF9C\uFFC0\uFFE0\uFFDB\uFFC0\uFFC0\uFFC0\uFF9C\uFFC0\uFFC0\uFFC0\uFFC0\uFFC0\uFFC0\uFF9C\uFF9C\uFFDB\uFFDC \u001C\uFFE0\u001C@   \uFFDC@\uFFDB  \uFFC0\uFFC0\uFFE0\uFFC0";
        callMethod(klass, "soundex", argTypes, term161759, args);
    }

};


