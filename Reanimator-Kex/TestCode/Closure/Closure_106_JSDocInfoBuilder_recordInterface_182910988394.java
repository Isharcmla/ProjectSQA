package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordInterface_182910988394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154899;
     Object term155034;

    public JSDocInfoBuilder_recordInterface_182910988394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154899 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term154979 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term154979, term154979.getClass(), "bitset", 512);
        setField(term154899, term154899.getClass(), "currentInfo", term154979);
        term155034 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term155035 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term155035, term155035.getClass(), "info", null);
        setField(term155035, term155035.getClass(), "documentation", null);
        setField(term155035, term155035.getClass(), "sourceName", null);
        setField(term155035, term155035.getClass(), "visibility", null);
        setIntField(term155035, term155035.getClass(), "bitset", 512);
        setField(term155035, term155035.getClass(), "type", null);
        setField(term155035, term155035.getClass(), "thisType", null);
        setBooleanField(term155035, term155035.getClass(), "includeDocumentation", false);
        setField(term155034, term155034.getClass(), "currentInfo", term155035);
        setBooleanField(term155034, term155034.getClass(), "populated", false);
        setBooleanField(term155034, term155034.getClass(), "parseDocumentation", false);
        setField(term155034, term155034.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordInterface", argTypes, term154899, args);
        assertTrue(recursiveEquals(term154899, term155034));
        assertTrue(recursiveEquals(retValue, false));
    }

};


