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

public class ExtendedProperties_getKeys_406677329819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4598172;

    public ExtendedProperties_getKeys_406677329819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4598276 = new ArrayList();
        Object[] term4597944 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term4598224 = new ArrayList();
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add(term4598276);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add(term4598276);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)term4597944);
        ((ArrayList) term4598224).add("");
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        ((ArrayList) term4598224).add((Object)null);
        term4598172 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term4598172, term4598172.getClass(), "keysAsListed", term4598224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term4598172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


