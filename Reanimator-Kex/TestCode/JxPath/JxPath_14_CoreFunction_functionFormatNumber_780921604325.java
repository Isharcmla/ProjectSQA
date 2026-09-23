package org.apache.commons.jxpath.ri.compiler;

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
import java.lang.StackOverflowError;
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoreFunction_functionFormatNumber_780921604325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94705;

    public CoreFunction_functionFormatNumber_780921604325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term94496 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        Object term94811 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term94811, term94811.getClass(), "functionCode", 0);
        setElement(term94496, 0, term94811);
        setElement(term94496, 1, term94705);
        setField(term94705, term94705.getClass(), "args", term94496);
        setIntField(term94705, term94705.getClass(), "functionCode", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "functionFormatNumber", argTypes, term94705, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


