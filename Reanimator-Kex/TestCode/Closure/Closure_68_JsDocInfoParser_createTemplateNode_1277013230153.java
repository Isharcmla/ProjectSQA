package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;

public class JsDocInfoParser_createTemplateNode_1277013230153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79529;
     Object term154734;

    public JsDocInfoParser_createTemplateNode_1277013230153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79529 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term79529, term79529.getClass(), "stream", null);
        setField(term79529, term79529.getClass(), "jsdocBuilder", null);
        setField(term79529, term79529.getClass(), "sourceName", null);
        setField(term79529, term79529.getClass(), "errorReporter", null);
        setField(term79529, term79529.getClass(), "parser", null);
        setField(term79529, term79529.getClass(), "templateNode", null);
        setField(term79529, term79529.getClass(), "fileOverviewJSDocInfo", null);
        setField(term79529, term79529.getClass(), "state", null);
        setField(term79529, term79529.getClass(), "annotationNames", null);
        setField(term79529, term79529.getClass(), "suppressionNames", null);
        setField(term79529, term79529.getClass(), "fileLevelJsDocBuilder", null);
        setField(term79529, term79529.getClass(), "unreadToken", null);
        term154734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term154734, term154734.getClass(), "type", 132);
        setField(term154734, term154734.getClass(), "next", null);
        setField(term154734, term154734.getClass(), "first", null);
        setField(term154734, term154734.getClass(), "last", null);
        setField(term154734, term154734.getClass(), "propListHead", null);
        setIntField(term154734, term154734.getClass(), "sourcePosition", -1);
        setField(term154734, term154734.getClass(), "jsType", null);
        setField(term154734, term154734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTemplateNode", argTypes, term79529, args);
        assertTrue(recursiveEquals(term79529, term154734));
    }

};


