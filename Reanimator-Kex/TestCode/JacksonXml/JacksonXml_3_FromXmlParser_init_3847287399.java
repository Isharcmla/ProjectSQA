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

public class FromXmlParser_init_3847287399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14859;
     Object term14959;

    public FromXmlParser_init_3847287399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14673 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term14775 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term14673, term14673.getClass(), "_features", 0);
        setField(term14673, term14673.getClass(), "_cfgNameForTextElement", null);
        setField(term14673, term14673.getClass(), "_byteArrayBuilder", term14775);
        setIntField(term14673, term14673.getClass(), "_formatFeatures", 0);
        setField(term14673, term14673.getClass(), "_ioContext", null);
        setField(term14673, term14673.getClass(), "_objectCodec", null);
        setField(term14673, term14673.getClass(), "_parsingContext", null);
        setField(term14673, term14673.getClass(), "_nextToken", null);
        term14859 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term14859, term14859.getClass(), "_sourceRef", null);
        term14959 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
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
        args[0] = term14859;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        args[4] = term14959;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


