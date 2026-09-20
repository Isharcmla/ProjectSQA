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
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.StringBuffer;

public class Metaphone_regionMatch_138966537687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45150;
     Object term45208;
     Object term46319;
     Object term46320;

    public Metaphone_regionMatch_138966537687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45150 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        term45208 = new StringBuffer();
        term46319 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term46319, term46319.getClass(), "maxCodeLen", 0);
        term46320 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term46321 = (byte[]) newByteArray(16);
        setField(term46320, term46320.getClass(), "toStringCache", null);
        setField(term46320, term46320.getClass(), "value", term46321);
        setByteField(term46320, term46320.getClass(), "coder", (byte) 0);
        setIntField(term46320, term46320.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term45208;
        args[1] = 515;
        args[2] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
        Object retValue = callMethod(klass, "regionMatch", argTypes, term45150, args);
        assertTrue(recursiveEquals(term45150, term46319));
        assertTrue(recursiveEquals(term45208, term46320));
        assertTrue(recursiveEquals(retValue, false));
    }

};
