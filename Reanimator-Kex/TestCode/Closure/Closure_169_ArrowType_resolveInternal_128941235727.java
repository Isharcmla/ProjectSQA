package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_resolveInternal_128941235727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540;

    public ArrowType_resolveInternal_128941235727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term541, term541.getClass(), "type", 538259104);
        setIntField(term543, term543.getClass(), "type", 96566506);
        setIntField(term545, term545.getClass(), "type", -343325701);
        setIntField(term547, term547.getClass(), "type", 107945604);
        setField(term547, term547.getClass(), "next", null);
        setField(term547, term547.getClass(), "first", null);
        setField(term547, term547.getClass(), "last", null);
        setField(term547, term547.getClass(), "propListHead", null);
        setIntField(term547, term547.getClass(), "sourcePosition", 0);
        setField(term547, term547.getClass(), "jsType", null);
        setField(term547, term547.getClass(), "parent", null);
        setField(term545, term545.getClass(), "next", term547);
        setIntField(term550, term550.getClass(), "type", -2015048153);
        setField(term550, term550.getClass(), "next", null);
        setField(term550, term550.getClass(), "first", term541);
        setField(term550, term550.getClass(), "last", null);
        setField(term550, term550.getClass(), "propListHead", null);
        setIntField(term550, term550.getClass(), "sourcePosition", 0);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        setField(term545, term545.getClass(), "first", term550);
        setIntField(term553, term553.getClass(), "type", 71190297);
        setField(term553, term553.getClass(), "next", null);
        setField(term553, term553.getClass(), "first", term543);
        setField(term553, term553.getClass(), "last", null);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term545, term545.getClass(), "last", term553);
        setField(term545, term545.getClass(), "propListHead", null);
        setIntField(term545, term545.getClass(), "sourcePosition", 0);
        setField(term545, term545.getClass(), "jsType", null);
        setField(term545, term545.getClass(), "parent", null);
        setField(term543, term543.getClass(), "next", term545);
        setField(term543, term543.getClass(), "first", term545);
        setIntField(term557, term557.getClass(), "type", -1963464809);
        setField(term557, term557.getClass(), "next", term553);
        setField(term557, term557.getClass(), "first", term550);
        setField(term557, term557.getClass(), "last", term550);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term543, term543.getClass(), "last", term557);
        setField(term543, term543.getClass(), "propListHead", null);
        setIntField(term543, term543.getClass(), "sourcePosition", 0);
        setField(term543, term543.getClass(), "jsType", null);
        setField(term543, term543.getClass(), "parent", null);
        setField(term541, term541.getClass(), "next", term543);
        setField(term541, term541.getClass(), "first", term550);
        setIntField(term561, term561.getClass(), "type", 0);
        setField(term561, term561.getClass(), "next", null);
        setField(term561, term561.getClass(), "first", null);
        setField(term561, term561.getClass(), "last", null);
        setField(term561, term561.getClass(), "propListHead", null);
        setIntField(term561, term561.getClass(), "sourcePosition", 0);
        setField(term561, term561.getClass(), "jsType", null);
        setField(term561, term561.getClass(), "parent", null);
        setField(term541, term541.getClass(), "last", term561);
        setField(term541, term541.getClass(), "propListHead", null);
        setIntField(term541, term541.getClass(), "sourcePosition", 0);
        setField(term541, term541.getClass(), "jsType", null);
        setField(term541, term541.getClass(), "parent", null);
        setField(term540, term540.getClass(), "parameters", term541);
        setField(term540, term540.getClass(), "returnType", null);
        setBooleanField(term540, term540.getClass(), "returnTypeInferred", false);
        setBooleanField(term540, term540.getClass(), "resolved", false);
        setField(term540, term540.getClass(), "resolveResult", null);
        setBooleanField(term540, term540.getClass(), "inTemplatedCheckVisit", false);
        setField(term540, term540.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


