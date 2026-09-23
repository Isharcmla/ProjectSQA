package com.fasterxml.jackson.core.filter;

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
import static com.fasterxml.jackson.core.filter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.filter.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Object;

public class FilteringParserDelegate_init_88275387855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term79;

    public FilteringParserDelegate_init_88275387855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term3 = new Boolean(false);
        term79 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term80 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(term79, term79.getClass(), "rootFilter", null);
        setBooleanField(term79, term79.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term79, term79.getClass(), "_includePath", false);
        setBooleanField(term79, term79.getClass(), "_includeImmediateParent", false);
        setField(term79, term79.getClass(), "_currToken", null);
        setField(term79, term79.getClass(), "_lastClearedToken", null);
        setField(term80, term80.getClass(), "_parent", null);
        setField(term80, term80.getClass(), "_child", null);
        setField(term80, term80.getClass(), "_currentName", null);
        setField(term80, term80.getClass(), "_filter", null);
        setBooleanField(term80, term80.getClass(), "_startHandled", true);
        setBooleanField(term80, term80.getClass(), "_needToHandleName", false);
        setIntField(term80, term80.getClass(), "_type", 0);
        setIntField(term80, term80.getClass(), "_index", -1);
        setField(term79, term79.getClass(), "_headContext", term80);
        setField(term79, term79.getClass(), "_exposedContext", null);
        setField(term79, term79.getClass(), "_itemFilter", null);
        setIntField(term79, term79.getClass(), "_matchCount", 0);
        setField(term79, term79.getClass(), "delegate", null);
        setIntField(term79, term79.getClass(), "_features", 0);
        setField(term79, term79.getClass(), "_requestPayload", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.filter.TokenFilter");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term79));
        assertTrue(recursiveEquals(term1, false));
        assertTrue(recursiveEquals(term3, false));
    }

};


