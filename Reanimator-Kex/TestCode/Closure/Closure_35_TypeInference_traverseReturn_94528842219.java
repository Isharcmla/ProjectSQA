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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_94528842219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257826;
     Object term257896;

    public TypeInference_traverseReturn_94528842219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257826 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term257896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term257966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term257966, term257966.getClass(), "type", 9);
        setIntField(term258036, term258036.getClass(), "type", 9);
        setIntField(term258106, term258106.getClass(), "type", 9);
        setIntField(term258176, term258176.getClass(), "type", 9);
        setIntField(term258246, term258246.getClass(), "type", 9);
        setIntField(term258316, term258316.getClass(), "type", 9);
        setIntField(term258386, term258386.getClass(), "type", 9);
        setIntField(term258456, term258456.getClass(), "type", 9);
        setIntField(term258526, term258526.getClass(), "type", 9);
        setIntField(term258596, term258596.getClass(), "type", 9);
        setIntField(term258666, term258666.getClass(), "type", 9);
        setIntField(term258736, term258736.getClass(), "type", 9);
        setIntField(term258806, term258806.getClass(), "type", 9);
        setIntField(term258876, term258876.getClass(), "type", 9);
        setIntField(term258946, term258946.getClass(), "type", 9);
        setIntField(term259016, term259016.getClass(), "type", 9);
        setIntField(term259086, term259086.getClass(), "type", 9);
        setIntField(term259156, term259156.getClass(), "type", 9);
        setIntField(term259226, term259226.getClass(), "type", 9);
        setIntField(term259296, term259296.getClass(), "type", 9);
        setIntField(term259366, term259366.getClass(), "type", 9);
        setIntField(term259436, term259436.getClass(), "type", 9);
        setIntField(term259506, term259506.getClass(), "type", 9);
        setIntField(term259576, term259576.getClass(), "type", 9);
        setIntField(term259646, term259646.getClass(), "type", 9);
        setIntField(term259716, term259716.getClass(), "type", 9);
        setIntField(term259786, term259786.getClass(), "type", 9);
        setIntField(term259856, term259856.getClass(), "type", 9);
        setIntField(term259926, term259926.getClass(), "type", 9);
        setIntField(term259996, term259996.getClass(), "type", 9);
        setIntField(term260066, term260066.getClass(), "type", 9);
        setIntField(term260136, term260136.getClass(), "type", 9);
        setIntField(term260206, term260206.getClass(), "type", 9);
        setIntField(term260276, term260276.getClass(), "type", 9);
        setIntField(term260346, term260346.getClass(), "type", 9);
        setIntField(term260416, term260416.getClass(), "type", 9);
        setIntField(term260486, term260486.getClass(), "type", 9);
        setIntField(term260556, term260556.getClass(), "type", 9);
        setIntField(term260626, term260626.getClass(), "type", 36);
        setField(term260556, term260556.getClass(), "first", term260626);
        setField(term260486, term260486.getClass(), "first", term260556);
        setField(term260416, term260416.getClass(), "first", term260486);
        setField(term260346, term260346.getClass(), "first", term260416);
        setField(term260276, term260276.getClass(), "first", term260346);
        setField(term260206, term260206.getClass(), "first", term260276);
        setField(term260136, term260136.getClass(), "first", term260206);
        setField(term260066, term260066.getClass(), "first", term260136);
        setField(term259996, term259996.getClass(), "first", term260066);
        setField(term259926, term259926.getClass(), "first", term259996);
        setField(term259856, term259856.getClass(), "first", term259926);
        setField(term259786, term259786.getClass(), "first", term259856);
        setField(term259716, term259716.getClass(), "first", term259786);
        setField(term259646, term259646.getClass(), "first", term259716);
        setField(term259576, term259576.getClass(), "first", term259646);
        setField(term259506, term259506.getClass(), "first", term259576);
        setField(term259436, term259436.getClass(), "first", term259506);
        setField(term259366, term259366.getClass(), "first", term259436);
        setField(term259296, term259296.getClass(), "first", term259366);
        setField(term259226, term259226.getClass(), "first", term259296);
        setField(term259156, term259156.getClass(), "first", term259226);
        setField(term259086, term259086.getClass(), "first", term259156);
        setField(term259016, term259016.getClass(), "first", term259086);
        setField(term258946, term258946.getClass(), "first", term259016);
        setField(term258876, term258876.getClass(), "first", term258946);
        setField(term258806, term258806.getClass(), "first", term258876);
        setField(term258736, term258736.getClass(), "first", term258806);
        setField(term258666, term258666.getClass(), "first", term258736);
        setField(term258596, term258596.getClass(), "first", term258666);
        setField(term258526, term258526.getClass(), "first", term258596);
        setField(term258456, term258456.getClass(), "first", term258526);
        setField(term258386, term258386.getClass(), "first", term258456);
        setField(term258316, term258316.getClass(), "first", term258386);
        setField(term258246, term258246.getClass(), "first", term258316);
        setField(term258176, term258176.getClass(), "first", term258246);
        setField(term258106, term258106.getClass(), "first", term258176);
        setField(term258036, term258036.getClass(), "first", term258106);
        setField(term257966, term257966.getClass(), "first", term258036);
        setField(term257896, term257896.getClass(), "first", term257966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term257896;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term257826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


