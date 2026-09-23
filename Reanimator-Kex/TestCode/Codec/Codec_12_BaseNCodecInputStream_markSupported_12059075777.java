package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class BaseNCodecInputStream_markSupported_12059075777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term584;

    public BaseNCodecInputStream_markSupported_12059075777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term40 = (byte[]) newByteArray(4);
        setBooleanField(term38, term38.getClass(), "doEncode", false);
        setField(term38, term38.getClass(), "baseNCodec", null);
        setByteElement(term40, 0, (byte) 83);
        setByteElement(term40, 1, (byte) 74);
        setByteElement(term40, 2, (byte) -71);
        setByteElement(term40, 3, (byte) 49);
        setField(term38, term38.getClass(), "singleByte", term40);
        setField(term38, term38.getClass(), "in", null);
        term584 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term585 = (byte[]) newByteArray(4);
        setBooleanField(term584, term584.getClass(), "doEncode", false);
        setField(term584, term584.getClass(), "baseNCodec", null);
        setByteElement(term585, 0, (byte) 83);
        setByteElement(term585, 1, (byte) 74);
        setByteElement(term585, 2, (byte) -71);
        setByteElement(term585, 3, (byte) 49);
        setField(term584, term584.getClass(), "singleByte", term585);
        setField(term584, term584.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "markSupported", argTypes, term38, args);
        assertTrue(recursiveEquals(term38, term584));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


