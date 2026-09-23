package com.fasterxml.jackson.dataformat.xml.deser;

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
import static com.fasterxml.jackson.dataformat.xml.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTokenStream_init_105907526577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17730;
     Object term18102;

    public XmlTokenStream_init_105907526577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17592 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object term17630 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17592, term17592.getClass(), "_nextAttributeIndex", 0);
        setField(term17592, term17592.getClass(), "_sourceReference", term17630);
        term17730 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        Object term17816 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Object term17902 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Object term18002 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        setField(term17902, term17902.getClass(), "reader", term18002);
        setField(term17816, term17816.getClass(), "reader", term17902);
        setField(term17730, term17730.getClass(), "reader", term17816);
        term18102 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.xml.stream.XMLStreamReader");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term17730;
        args[1] = term18102;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


