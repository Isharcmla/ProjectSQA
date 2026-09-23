package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;

public class Node_isWith_1282344360842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56766;
     Object term96669;

    public Node_isWith_1282344360842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56766, term56766.getClass(), "type", 119);
        term96669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96669, term96669.getClass(), "type", 119);
        setField(term96669, term96669.getClass(), "next", null);
        setField(term96669, term96669.getClass(), "first", null);
        setField(term96669, term96669.getClass(), "last", null);
        setField(term96669, term96669.getClass(), "propListHead", null);
        setIntField(term96669, term96669.getClass(), "sourcePosition", 0);
        setField(term96669, term96669.getClass(), "jsType", null);
        setField(term96669, term96669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isWith", argTypes, term56766, args);
        assertTrue(recursiveEquals(term56766, term96669));
        assertTrue(recursiveEquals(retValue, true));
    }

};


