package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.String;

public class DataUtil_detectCharsetFromBom_116151196067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10386;
     Object term14460;

    public DataUtil_detectCharsetFromBom_116151196067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10386 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        term14460 = Class.forName((String) "java.lang.Character$Subset");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term10386;
        args[1] = null;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term10386, term14460));
        assertTrue(recursiveEquals(retValue, null));
    }

};


