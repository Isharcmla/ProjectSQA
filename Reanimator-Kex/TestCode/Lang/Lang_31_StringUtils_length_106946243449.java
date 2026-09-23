package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class StringUtils_length_106946243449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136970;
     Object term5559;

    public StringUtils_length_106946243449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136970 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term5559 = (byte[]) newByteArray(10);
        setByteElement(term5559, 0, (byte) 80);
        setByteElement(term5559, 1, (byte) 65);
        setByteElement(term5559, 2, (byte) 69);
        setByteElement(term5559, 3, (byte) 66);
        setByteElement(term5559, 4, (byte) 116);
        setByteElement(term5559, 5, (byte) 110);
        setByteElement(term5559, 6, (byte) 90);
        setByteElement(term5559, 7, (byte) 116);
        setByteElement(term5559, 8, (byte) 84);
        setByteElement(term5559, 9, (byte) 68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "length", argTypes, term136970, args);
        assertTrue(recursiveEquals(retValue, term5559));
    }

};


