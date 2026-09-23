package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154398;
     Object term154681;

    public JsonTreeReader_getPath_1170023302374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154398 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term154118 = (Object[]) newArray("java.lang.Object", 301);
        Object term154456 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154514 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154552 = newInstance(Class.forName("java.lang.Object"));
        Object term154610 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154648 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term154398, term154398.getClass(), "stackSize", 6);
        setElement(term154118, 0, term154456);
        setElement(term154118, 2, term154514);
        setElement(term154118, 3, term154552);
        setElement(term154118, 4, term154610);
        setElement(term154118, 256, term154648);
        setField(term154398, term154398.getClass(), "stack", term154118);
        term154681 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term154682 = (Object[]) newArray("java.lang.Object", 301);
        Object term154683 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154684 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154685 = newInstance(Class.forName("java.lang.Object"));
        Object term154686 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term154687 = newInstance(Class.forName("java.lang.Object"));
        setField(term154683, term154683.getClass(), "members", null);
        setElement(term154682, 0, term154683);
        setField(term154684, term154684.getClass(), "members", null);
        setElement(term154682, 2, term154684);
        setElement(term154682, 3, term154685);
        setField(term154686, term154686.getClass(), "members", null);
        setElement(term154682, 4, term154686);
        setElement(term154682, 256, term154687);
        setField(term154681, term154681.getClass(), "stack", term154682);
        setIntField(term154681, term154681.getClass(), "stackSize", 0);
        setField(term154681, term154681.getClass(), "pathNames", null);
        setField(term154681, term154681.getClass(), "pathIndices", null);
        setField(term154681, term154681.getClass(), "in", null);
        setBooleanField(term154681, term154681.getClass(), "lenient", false);
        setField(term154681, term154681.getClass(), "buffer", null);
        setIntField(term154681, term154681.getClass(), "pos", 0);
        setIntField(term154681, term154681.getClass(), "limit", 0);
        setIntField(term154681, term154681.getClass(), "lineNumber", 0);
        setIntField(term154681, term154681.getClass(), "lineStart", 0);
        setIntField(term154681, term154681.getClass(), "peeked", 0);
        setLongField(term154681, term154681.getClass(), "peekedLong", 0L);
        setIntField(term154681, term154681.getClass(), "peekedNumberLength", 0);
        setField(term154681, term154681.getClass(), "peekedString", null);
        setField(term154681, term154681.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term154398, args);
        assertTrue(recursiveEquals(term154398, term154681));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


