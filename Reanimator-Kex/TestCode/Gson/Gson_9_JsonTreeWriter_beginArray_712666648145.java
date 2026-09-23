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
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_beginArray_712666648145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31215;
     Object term31566;
     Object term31553;

    public JsonTreeWriter_beginArray_712666648145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31267 = new ArrayList();
        term31215 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term31215, term31215.getClass(), "pendingName", null);
        setField(term31215, term31215.getClass(), "stack", term31267);
        ArrayList term31570 = new ArrayList();
        Object term31569 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term31569, term31569.getClass(), "elements", term31570);
        ArrayList term31567 = new ArrayList();
        ((ArrayList) term31567).add(term31569);
        term31566 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term31566, term31566.getClass(), "stack", term31567);
        setField(term31566, term31566.getClass(), "pendingName", null);
        setField(term31566, term31566.getClass(), "product", term31569);
        setField(term31566, term31566.getClass(), "out", null);
        setField(term31566, term31566.getClass(), "stack", null);
        setIntField(term31566, term31566.getClass(), "stackSize", 0);
        setField(term31566, term31566.getClass(), "indent", null);
        setField(term31566, term31566.getClass(), "separator", null);
        setBooleanField(term31566, term31566.getClass(), "lenient", false);
        setBooleanField(term31566, term31566.getClass(), "htmlSafe", false);
        setField(term31566, term31566.getClass(), "deferredName", null);
        setBooleanField(term31566, term31566.getClass(), "serializeNulls", false);
        ArrayList term31557 = new ArrayList();
        Object term31556 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term31556, term31556.getClass(), "elements", term31557);
        ArrayList term31554 = new ArrayList();
        ((ArrayList) term31554).add(term31556);
        term31553 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term31553, term31553.getClass(), "stack", term31554);
        setField(term31553, term31553.getClass(), "pendingName", null);
        setField(term31553, term31553.getClass(), "product", term31556);
        setField(term31553, term31553.getClass(), "out", null);
        setField(term31553, term31553.getClass(), "stack", null);
        setIntField(term31553, term31553.getClass(), "stackSize", 0);
        setField(term31553, term31553.getClass(), "indent", null);
        setField(term31553, term31553.getClass(), "separator", null);
        setBooleanField(term31553, term31553.getClass(), "lenient", false);
        setBooleanField(term31553, term31553.getClass(), "htmlSafe", false);
        setField(term31553, term31553.getClass(), "deferredName", null);
        setBooleanField(term31553, term31553.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "beginArray", argTypes, term31215, args);
        assertTrue(recursiveEquals(term31215, term31566));
        assertTrue(recursiveEquals(retValue, term31553));
    }

};


