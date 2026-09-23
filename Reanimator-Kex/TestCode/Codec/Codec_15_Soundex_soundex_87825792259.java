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

public class Soundex_soundex_87825792259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338346;

    public Soundex_soundex_87825792259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338346 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "[[\\[[\uFFDC[\uFFDB[\\\uFFDB\uFFDB[\uFFDB[\uFFDB[[[\\\uFFDC\uFFDC\uFFDC[\uFFDC\\{\\[[\uFFDB\\\uFFDC[\uFFDB\uFFDB\uFFDB[\uFFDC\\[\uFFDB[\\[[\uFFDB[[\uFFDB[[[[\\\uFFDB[\\\\\\[\uFFDB\uFFDB\uFFDB\uFFDB[[\uFFDB[[\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDC\uFFDB\uFFDB\uFFDB[\uFFDB[\uFFDB\uFFDB\uFFDB[[\uFFDB[\uFFDC\uFFDB\uFFDC\uFFDB[\uFFDB\uFFDB[[[[[\uFFDB\uFFDB[\uFFDB\uFFDB\uFFDB\\\uFFDB\uFFDB\uFFDB\uFFDC[\uFFDB\uFFDB   [      8    \u000B\\ \uFFDB[\uFFDB\uFFDB\uFFDB\uFFDB[\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB[\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB[\uFFDB\uFFDB\uFFDB\uFF9B\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB[\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDB\uFFDBk                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "soundex", argTypes, term338346, args);
    }

};


