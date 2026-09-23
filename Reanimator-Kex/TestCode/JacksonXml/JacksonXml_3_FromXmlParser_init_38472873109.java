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

public class FromXmlParser_init_38472873109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22833;
     Object term22933;

    public FromXmlParser_init_38472873109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22647 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term22749 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term22647, term22647.getClass(), "_features", 0);
        setField(term22647, term22647.getClass(), "_cfgNameForTextElement", null);
        setField(term22647, term22647.getClass(), "_byteArrayBuilder", term22749);
        setIntField(term22647, term22647.getClass(), "_formatFeatures", 0);
        setField(term22647, term22647.getClass(), "_ioContext", null);
        setField(term22647, term22647.getClass(), "_objectCodec", null);
        setField(term22647, term22647.getClass(), "_parsingContext", null);
        setField(term22647, term22647.getClass(), "_nextToken", null);
        term22833 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term22833, term22833.getClass(), "_sourceRef", null);
        term22933 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        Object term23019 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        setField(term22933, term22933.getClass(), "reader", term23019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamReader");
        Object[] args = new Object[5];
        args[0] = term22833;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        args[4] = term22933;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


