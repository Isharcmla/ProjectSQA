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

public class JsonTreeWriter_beginObject_163587840097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16573;
     Object term16658;
     Object term16645;

    public JsonTreeWriter_beginObject_163587840097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16625 = new ArrayList();
        term16573 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term16573, term16573.getClass(), "pendingName", null);
        setField(term16573, term16573.getClass(), "stack", term16625);
        Object term16661 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term16662 = newInstance(Class.forName("com.google.gson.internal.LinkedTreeMap"));
        setField(term16662, term16662.getClass(), "comparator", null);
        setField(term16662, term16662.getClass(), "root", null);
        setIntField(term16662, term16662.getClass(), "size", 0);
        setIntField(term16662, term16662.getClass(), "modCount", 0);
        setField(term16662, term16662.getClass(), "header", null);
        setField(term16662, term16662.getClass(), "entrySet", null);
        setField(term16662, term16662.getClass(), "keySet", null);
        setField(term16662, term16662.getClass(), "keySet", null);
        setField(term16662, term16662.getClass(), "values", null);
        setField(term16661, term16661.getClass(), "members", term16662);
        ArrayList term16659 = new ArrayList();
        ((ArrayList) term16659).add(term16661);
        term16658 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term16658, term16658.getClass(), "stack", term16659);
        setField(term16658, term16658.getClass(), "pendingName", null);
        setField(term16658, term16658.getClass(), "product", term16661);
        setField(term16658, term16658.getClass(), "out", null);
        setField(term16658, term16658.getClass(), "stack", null);
        setIntField(term16658, term16658.getClass(), "stackSize", 0);
        setField(term16658, term16658.getClass(), "indent", null);
        setField(term16658, term16658.getClass(), "separator", null);
        setBooleanField(term16658, term16658.getClass(), "lenient", false);
        setBooleanField(term16658, term16658.getClass(), "htmlSafe", false);
        setField(term16658, term16658.getClass(), "deferredName", null);
        setBooleanField(term16658, term16658.getClass(), "serializeNulls", false);
        Object term16648 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term16649 = newInstance(Class.forName("com.google.gson.internal.LinkedTreeMap"));
        setField(term16649, term16649.getClass(), "comparator", null);
        setField(term16649, term16649.getClass(), "root", null);
        setIntField(term16649, term16649.getClass(), "size", 0);
        setIntField(term16649, term16649.getClass(), "modCount", 0);
        setField(term16649, term16649.getClass(), "header", null);
        setField(term16649, term16649.getClass(), "entrySet", null);
        setField(term16649, term16649.getClass(), "keySet", null);
        setField(term16649, term16649.getClass(), "keySet", null);
        setField(term16649, term16649.getClass(), "values", null);
        setField(term16648, term16648.getClass(), "members", term16649);
        ArrayList term16646 = new ArrayList();
        ((ArrayList) term16646).add(term16648);
        term16645 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term16645, term16645.getClass(), "stack", term16646);
        setField(term16645, term16645.getClass(), "pendingName", null);
        setField(term16645, term16645.getClass(), "product", term16648);
        setField(term16645, term16645.getClass(), "out", null);
        setField(term16645, term16645.getClass(), "stack", null);
        setIntField(term16645, term16645.getClass(), "stackSize", 0);
        setField(term16645, term16645.getClass(), "indent", null);
        setField(term16645, term16645.getClass(), "separator", null);
        setBooleanField(term16645, term16645.getClass(), "lenient", false);
        setBooleanField(term16645, term16645.getClass(), "htmlSafe", false);
        setField(term16645, term16645.getClass(), "deferredName", null);
        setBooleanField(term16645, term16645.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "beginObject", argTypes, term16573, args);
        assertTrue(recursiveEquals(term16573, term16658));
        assertTrue(recursiveEquals(retValue, term16645));
    }

};


