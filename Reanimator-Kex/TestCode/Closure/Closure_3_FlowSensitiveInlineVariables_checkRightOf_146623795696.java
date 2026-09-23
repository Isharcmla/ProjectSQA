package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FlowSensitiveInlineVariables_checkRightOf_146623795696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29162;
     Object term29302;
     Object term29414;

    public FlowSensitiveInlineVariables_checkRightOf_146623795696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29162, term29162.getClass(), "next", term29232);
        term29302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term29450 = Class.forName((String) "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularFieldAccessor");
        term29414 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term29414, term29414.getClass(), "clazz", term29450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term29162;
        args[1] = term29302;
        args[2] = term29414;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


