package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class JsonMappingException_wrapWithPath_481861005313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490628;
     Object term492776;
     Object term492770;

    public JsonMappingException_wrapWithPath_481861005313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term490682 = new LinkedList();
        term490628 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term490628, term490628.getClass(), "_path", term490682);
        LinkedList term492777 = new LinkedList();
        ((LinkedList) term492777).add((Object)null);
        term492776 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term492776, term492776.getClass(), "_path", term492777);
        setField(term492776, term492776.getClass(), "_processor", null);
        setField(term492776, term492776.getClass(), "_location", null);
        setField(term492776, term492776.getClass(), "backtrace", null);
        setField(term492776, term492776.getClass(), "detailMessage", null);
        setField(term492776, term492776.getClass(), "cause", null);
        setField(term492776, term492776.getClass(), "stackTrace", null);
        setIntField(term492776, term492776.getClass(), "depth", 0);
        setField(term492776, term492776.getClass(), "suppressedExceptions", null);
        LinkedList term492771 = new LinkedList();
        ((LinkedList) term492771).add((Object)null);
        term492770 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term492770, term492770.getClass(), "_path", term492771);
        setField(term492770, term492770.getClass(), "_processor", null);
        setField(term492770, term492770.getClass(), "_location", null);
        setField(term492770, term492770.getClass(), "backtrace", null);
        setField(term492770, term492770.getClass(), "detailMessage", null);
        setField(term492770, term492770.getClass(), "cause", null);
        setField(term492770, term492770.getClass(), "stackTrace", null);
        setIntField(term492770, term492770.getClass(), "depth", 0);
        setField(term492770, term492770.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term490628;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term490628, null));
        assertTrue(recursiveEquals(retValue, term492770));
    }

};


