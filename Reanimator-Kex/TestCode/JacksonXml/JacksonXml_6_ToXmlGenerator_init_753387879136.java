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
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.dataformat.xml.ser.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedList;

public class ToXmlGenerator_init_753387879136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20500;
     Object term20596;
     Object term22865;
     Object term22871;
     Object term22872;

    public ToXmlGenerator_init_753387879136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20220 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term20312 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term20408 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setIntField(term20220, term20220.getClass(), "_features", 0);
        setField(term20220, term20220.getClass(), "_objectCodec", term20312);
        setField(term20220, term20220.getClass(), "_writeContext", null);
        setBooleanField(term20220, term20220.getClass(), "_cfgNumbersAsStrings", false);
        setField(term20220, term20220.getClass(), "_nextName", null);
        setBooleanField(term20220, term20220.getClass(), "_nextIsAttribute", false);
        setBooleanField(term20220, term20220.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term20220, term20220.getClass(), "_nextIsCData", false);
        setField(term20220, term20220.getClass(), "_elementNameStack", null);
        setIntField(term20220, term20220.getClass(), "_formatFeatures", 0);
        setField(term20220, term20220.getClass(), "_ioContext", null);
        setField(term20220, term20220.getClass(), "_originalXmlWriter", term20408);
        term20500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term20596 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        LinkedList term22867 = new LinkedList();
        term22865 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term22866 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        Object term22868 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term22869 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term22870 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term22866, term22866.getClass(), "mDelegate2", null);
        setField(term22866, term22866.getClass(), "mDelegate", null);
        setField(term22865, term22865.getClass(), "_xmlWriter", term22866);
        setField(term22865, term22865.getClass(), "_originalXmlWriter", term22866);
        setBooleanField(term22865, term22865.getClass(), "_stax2Emulation", false);
        setField(term22865, term22865.getClass(), "_ioContext", null);
        setIntField(term22865, term22865.getClass(), "_formatFeatures", 0);
        setField(term22865, term22865.getClass(), "_xmlPrettyPrinter", null);
        setBooleanField(term22865, term22865.getClass(), "_initialized", false);
        setField(term22865, term22865.getClass(), "_nextName", null);
        setBooleanField(term22865, term22865.getClass(), "_nextIsAttribute", false);
        setBooleanField(term22865, term22865.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term22865, term22865.getClass(), "_nextIsCData", false);
        setField(term22865, term22865.getClass(), "_elementNameStack", term22867);
        setField(term22868, term22868.getClass(), "_config", null);
        setField(term22868, term22868.getClass(), "_context", null);
        setField(term22868, term22868.getClass(), "_parserFactory", null);
        setBooleanField(term22868, term22868.getClass(), "_unwrapRoot", false);
        setField(term22868, term22868.getClass(), "_filter", null);
        setField(term22868, term22868.getClass(), "_valueType", null);
        setField(term22868, term22868.getClass(), "_rootDeserializer", null);
        setField(term22868, term22868.getClass(), "_valueToUpdate", null);
        setField(term22868, term22868.getClass(), "_schema", null);
        setField(term22868, term22868.getClass(), "_injectableValues", null);
        setField(term22868, term22868.getClass(), "_dataFormatReaders", null);
        setField(term22868, term22868.getClass(), "_rootDeserializers", null);
        setField(term22865, term22865.getClass(), "_objectCodec", term22868);
        setIntField(term22865, term22865.getClass(), "_features", -1);
        setBooleanField(term22865, term22865.getClass(), "_cfgNumbersAsStrings", true);
        setField(term22869, term22869.getClass(), "_parent", null);
        setField(term22870, term22870.getClass(), "_source", term22865);
        setField(term22870, term22870.getClass(), "_firstName", null);
        setField(term22870, term22870.getClass(), "_secondName", null);
        setField(term22870, term22870.getClass(), "_seen", null);
        setField(term22869, term22869.getClass(), "_dups", term22870);
        setField(term22869, term22869.getClass(), "_child", null);
        setField(term22869, term22869.getClass(), "_currentName", null);
        setField(term22869, term22869.getClass(), "_currentValue", null);
        setBooleanField(term22869, term22869.getClass(), "_gotName", false);
        setIntField(term22869, term22869.getClass(), "_type", 0);
        setIntField(term22869, term22869.getClass(), "_index", -1);
        setField(term22865, term22865.getClass(), "_writeContext", term22869);
        setBooleanField(term22865, term22865.getClass(), "_closed", false);
        setField(term22865, term22865.getClass(), "_cfgPrettyPrinter", null);
        term22871 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term22871, term22871.getClass(), "_config", null);
        setField(term22871, term22871.getClass(), "_context", null);
        setField(term22871, term22871.getClass(), "_parserFactory", null);
        setBooleanField(term22871, term22871.getClass(), "_unwrapRoot", false);
        setField(term22871, term22871.getClass(), "_filter", null);
        setField(term22871, term22871.getClass(), "_valueType", null);
        setField(term22871, term22871.getClass(), "_rootDeserializer", null);
        setField(term22871, term22871.getClass(), "_valueToUpdate", null);
        setField(term22871, term22871.getClass(), "_schema", null);
        setField(term22871, term22871.getClass(), "_injectableValues", null);
        setField(term22871, term22871.getClass(), "_dataFormatReaders", null);
        setField(term22871, term22871.getClass(), "_rootDeserializers", null);
        term22872 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setField(term22872, term22872.getClass(), "mDelegate2", null);
        setField(term22872, term22872.getClass(), "mDelegate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamWriter");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = -1;
        args[2] = 0;
        args[3] = term20500;
        args[4] = term20596;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22865));
        assertTrue(recursiveEquals(term20500, null));
        assertTrue(recursiveEquals(term20596, 0));
    }

};


