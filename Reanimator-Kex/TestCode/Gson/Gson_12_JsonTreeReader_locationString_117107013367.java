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

public class JsonTreeReader_locationString_117107013367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148247;
     Object term151768;

    public JsonTreeReader_locationString_117107013367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148247 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term147939 = (Object[]) newArray("java.lang.Object", 238);
        Object term148303 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term148413 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$ValueIterator"));
        Object term148499 = newInstance(Class.forName("java.util.regex.Pattern$1MatcherIterator"));
        Object term148555 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term148247, term148247.getClass(), "stackSize", 38);
        setElement(term147939, 1, term148303);
        setElement(term147939, 4, term148413);
        setElement(term147939, 5, term148499);
        setElement(term147939, 6, term148555);
        setField(term148247, term148247.getClass(), "stack", term147939);
        term151768 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term151769 = (Object[]) newArray("java.lang.Object", 238);
        Object term151770 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term151771 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$ValueIterator"));
        Object term151772 = newInstance(Class.forName("java.util.regex.Pattern$1MatcherIterator"));
        Object term151773 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term151770, term151770.getClass(), "elements", null);
        setElement(term151769, 1, term151770);
        setField(term151771, term151771.getClass(), "map", null);
        setField(term151771, term151771.getClass(), "lastReturned", null);
        setField(term151771, term151771.getClass(), "tab", null);
        setField(term151771, term151771.getClass(), "next", null);
        setField(term151771, term151771.getClass(), "stack", null);
        setField(term151771, term151771.getClass(), "spare", null);
        setIntField(term151771, term151771.getClass(), "index", 0);
        setIntField(term151771, term151771.getClass(), "baseIndex", 0);
        setIntField(term151771, term151771.getClass(), "baseLimit", 0);
        setIntField(term151771, term151771.getClass(), "baseSize", 0);
        setElement(term151769, 4, term151771);
        setField(term151772, term151772.getClass(), "matcher", null);
        setIntField(term151772, term151772.getClass(), "current", 0);
        setField(term151772, term151772.getClass(), "nextElement", null);
        setIntField(term151772, term151772.getClass(), "emptyElementCount", 0);
        setField(term151772, term151772.getClass(), "val$input", null);
        setField(term151772, term151772.getClass(), "this$0", null);
        setElement(term151769, 5, term151772);
        setField(term151773, term151773.getClass(), "elements", null);
        setElement(term151769, 6, term151773);
        setField(term151768, term151768.getClass(), "stack", term151769);
        setIntField(term151768, term151768.getClass(), "stackSize", 0);
        setField(term151768, term151768.getClass(), "pathNames", null);
        setField(term151768, term151768.getClass(), "pathIndices", null);
        setField(term151768, term151768.getClass(), "in", null);
        setBooleanField(term151768, term151768.getClass(), "lenient", false);
        setField(term151768, term151768.getClass(), "buffer", null);
        setIntField(term151768, term151768.getClass(), "pos", 0);
        setIntField(term151768, term151768.getClass(), "limit", 0);
        setIntField(term151768, term151768.getClass(), "lineNumber", 0);
        setIntField(term151768, term151768.getClass(), "lineStart", 0);
        setIntField(term151768, term151768.getClass(), "peeked", 0);
        setLongField(term151768, term151768.getClass(), "peekedLong", 0L);
        setIntField(term151768, term151768.getClass(), "peekedNumberLength", 0);
        setField(term151768, term151768.getClass(), "peekedString", null);
        setField(term151768, term151768.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term148247, args);
        assertTrue(recursiveEquals(term148247, term151768));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


