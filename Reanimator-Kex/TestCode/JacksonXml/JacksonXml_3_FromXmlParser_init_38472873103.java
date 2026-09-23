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
import java.lang.String;

public class FromXmlParser_init_38472873103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17479;
     Object term17667;
     Object term17753;

    public FromXmlParser_init_38472873103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18728 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term18727 = ((Class) term18728).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term18727).setAccessible(true);
        Object enum1 = ((Field) term18727).get((Object) null);
        Object term17067 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term17197 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term17317 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setIntField(term17067, term17067.getClass(), "_features", 0);
        setField(term17067, term17067.getClass(), "_cfgNameForTextElement", "");
        setField(term17067, term17067.getClass(), "_byteArrayBuilder", null);
        setIntField(term17067, term17067.getClass(), "_formatFeatures", 0);
        setField(term17067, term17067.getClass(), "_ioContext", null);
        setField(term17067, term17067.getClass(), "_objectCodec", term17197);
        setField(term17067, term17067.getClass(), "_parsingContext", term17317);
        setField(term17067, term17067.getClass(), "_nextToken", enum1);
        term17479 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term17575 = newInstance(Class.forName("org.codehaus.stax2.util.StreamReader2Delegate"));
        setField(term17479, term17479.getClass(), "_sourceRef", term17575);
        term17667 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term17753 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
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
        args[0] = term17479;
        args[1] = 0;
        args[2] = 0;
        args[3] = term17667;
        args[4] = term17753;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


