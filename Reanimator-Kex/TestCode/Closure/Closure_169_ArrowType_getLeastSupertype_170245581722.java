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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_getLeastSupertype_170245581722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public ArrowType_getLeastSupertype_170245581722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term401, term401.getClass(), "type", -1547384488);
        setIntField(term403, term403.getClass(), "type", 1442160736);
        setIntField(term405, term405.getClass(), "type", 1114000454);
        setIntField(term407, term407.getClass(), "type", -556405712);
        setField(term407, term407.getClass(), "next", null);
        setField(term407, term407.getClass(), "first", null);
        setField(term407, term407.getClass(), "last", null);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term405, term405.getClass(), "next", term407);
        setIntField(term410, term410.getClass(), "type", -344842608);
        setField(term410, term410.getClass(), "next", null);
        setField(term410, term410.getClass(), "first", term401);
        setField(term410, term410.getClass(), "last", null);
        setField(term410, term410.getClass(), "propListHead", null);
        setIntField(term410, term410.getClass(), "sourcePosition", 0);
        setField(term410, term410.getClass(), "jsType", null);
        setField(term410, term410.getClass(), "parent", null);
        setField(term405, term405.getClass(), "first", term410);
        setIntField(term413, term413.getClass(), "type", -1845499264);
        setField(term413, term413.getClass(), "next", null);
        setField(term413, term413.getClass(), "first", term403);
        setField(term413, term413.getClass(), "last", null);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        setField(term405, term405.getClass(), "last", term413);
        setField(term405, term405.getClass(), "propListHead", null);
        setIntField(term405, term405.getClass(), "sourcePosition", 0);
        setField(term405, term405.getClass(), "jsType", null);
        setField(term405, term405.getClass(), "parent", null);
        setField(term403, term403.getClass(), "next", term405);
        setField(term403, term403.getClass(), "first", term405);
        setIntField(term417, term417.getClass(), "type", -1772434990);
        setField(term417, term417.getClass(), "next", term413);
        setField(term417, term417.getClass(), "first", term410);
        setField(term417, term417.getClass(), "last", term410);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term403, term403.getClass(), "last", term417);
        setField(term403, term403.getClass(), "propListHead", null);
        setIntField(term403, term403.getClass(), "sourcePosition", 0);
        setField(term403, term403.getClass(), "jsType", null);
        setField(term403, term403.getClass(), "parent", null);
        setField(term401, term401.getClass(), "next", term403);
        setField(term401, term401.getClass(), "first", term410);
        setIntField(term421, term421.getClass(), "type", 0);
        setField(term421, term421.getClass(), "next", null);
        setField(term421, term421.getClass(), "first", null);
        setField(term421, term421.getClass(), "last", null);
        setField(term421, term421.getClass(), "propListHead", null);
        setIntField(term421, term421.getClass(), "sourcePosition", 0);
        setField(term421, term421.getClass(), "jsType", null);
        setField(term421, term421.getClass(), "parent", null);
        setField(term401, term401.getClass(), "last", term421);
        setField(term401, term401.getClass(), "propListHead", null);
        setIntField(term401, term401.getClass(), "sourcePosition", 0);
        setField(term401, term401.getClass(), "jsType", null);
        setField(term401, term401.getClass(), "parent", null);
        setField(term400, term400.getClass(), "parameters", term401);
        setField(term400, term400.getClass(), "returnType", null);
        setBooleanField(term400, term400.getClass(), "returnTypeInferred", false);
        setBooleanField(term400, term400.getClass(), "resolved", false);
        setField(term400, term400.getClass(), "resolveResult", null);
        setBooleanField(term400, term400.getClass(), "inTemplatedCheckVisit", false);
        setField(term400, term400.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term400, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


