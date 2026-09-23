package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_getKeys_406677329793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10832964;

    public ExtendedProperties_getKeys_406677329793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10833068 = new ArrayList();
        Object[] term10832736 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term10833016 = new ArrayList();
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add(term10833068);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add(term10833068);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)term10832736);
        ((ArrayList) term10833016).add("");
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        ((ArrayList) term10833016).add((Object)null);
        term10832964 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term10832964, term10832964.getClass(), "keysAsListed", term10833016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term10832964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


