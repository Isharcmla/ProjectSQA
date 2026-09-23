package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286923;
     Object term287015;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286923 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term287015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term287907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term288907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term289907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term290007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term290107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term290207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term290299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term290391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term287015, term287015.getClass(), "type", 13);
        setIntField(term287107, term287107.getClass(), "type", 0);
        setField(term290207, term290207.getClass(), "referencedType", term290299);
        setField(term290107, term290107.getClass(), "referencedType", term290207);
        setField(term290007, term290007.getClass(), "referencedType", term290107);
        setField(term289907, term289907.getClass(), "referencedType", term290007);
        setField(term289807, term289807.getClass(), "referencedType", term289907);
        setField(term289707, term289707.getClass(), "referencedType", term289807);
        setField(term289607, term289607.getClass(), "referencedType", term289707);
        setField(term289507, term289507.getClass(), "referencedType", term289607);
        setField(term289407, term289407.getClass(), "referencedType", term289507);
        setField(term289307, term289307.getClass(), "referencedType", term289407);
        setField(term289207, term289207.getClass(), "referencedType", term289307);
        setField(term289107, term289107.getClass(), "referencedType", term289207);
        setField(term289007, term289007.getClass(), "referencedType", term289107);
        setField(term288907, term288907.getClass(), "referencedType", term289007);
        setField(term288807, term288807.getClass(), "referencedType", term288907);
        setField(term288707, term288707.getClass(), "referencedType", term288807);
        setField(term288607, term288607.getClass(), "referencedType", term288707);
        setField(term288507, term288507.getClass(), "referencedType", term288607);
        setField(term288407, term288407.getClass(), "referencedType", term288507);
        setField(term288307, term288307.getClass(), "referencedType", term288407);
        setField(term288207, term288207.getClass(), "referencedType", term288307);
        setField(term288107, term288107.getClass(), "referencedType", term288207);
        setField(term288007, term288007.getClass(), "referencedType", term288107);
        setField(term287907, term287907.getClass(), "referencedType", term288007);
        setField(term287807, term287807.getClass(), "referencedType", term287907);
        setField(term287707, term287707.getClass(), "referencedType", term287807);
        setField(term287607, term287607.getClass(), "referencedType", term287707);
        setField(term287507, term287507.getClass(), "referencedType", term287607);
        setField(term287407, term287407.getClass(), "referencedType", term287507);
        setField(term287307, term287307.getClass(), "referencedType", term287407);
        setField(term287207, term287207.getClass(), "referencedType", term287307);
        setField(term287107, term287107.getClass(), "jsType", term287207);
        setField(term287015, term287015.getClass(), "first", term287107);
        setIntField(term290391, term290391.getClass(), "type", 0);
        setField(term290391, term290391.getClass(), "jsType", term290487);
        setField(term287015, term287015.getClass(), "last", term290391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term287015;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term286923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


