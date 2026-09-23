package com.fasterxml.jackson.dataformat.xml.ser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ToXmlGenerator_setNextNameIfMissing_55493969882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public ToXmlGenerator_setNextNameIfMissing_55493969882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term84, term84.getClass(), "namespaceURI", "xxtlPwDYFs");
        setField(term84, term84.getClass(), "localPart", "jJCZpVmanW");
        setField(term84, term84.getClass(), "prefix", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.xml.namespace.QName");
        Object[] args = new Object[1];
        args[0] = term84;
        try {
            callMethod(klass, "setNextNameIfMissing", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


