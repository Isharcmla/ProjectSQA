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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_isNew_889590303156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term951;
     Object term8688;

    public NodeUtil_isNew_889590303156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term964 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term951, term951.getClass(), "type", -439048495);
        setIntField(term953, term953.getClass(), "type", 787278105);
        setIntField(term955, term955.getClass(), "type", 0);
        setField(term955, term955.getClass(), "next", null);
        setField(term955, term955.getClass(), "first", null);
        setField(term955, term955.getClass(), "last", null);
        setField(term955, term955.getClass(), "propListHead", null);
        setIntField(term955, term955.getClass(), "sourcePosition", 0);
        setField(term955, term955.getClass(), "jsType", null);
        setField(term955, term955.getClass(), "parent", null);
        setField(term953, term953.getClass(), "next", term955);
        setIntField(term958, term958.getClass(), "type", 0);
        setField(term958, term958.getClass(), "next", null);
        setField(term958, term958.getClass(), "first", null);
        setField(term958, term958.getClass(), "last", null);
        setField(term958, term958.getClass(), "propListHead", null);
        setIntField(term958, term958.getClass(), "sourcePosition", 0);
        setField(term958, term958.getClass(), "jsType", null);
        setField(term958, term958.getClass(), "parent", null);
        setField(term953, term953.getClass(), "first", term958);
        setIntField(term961, term961.getClass(), "type", 0);
        setField(term961, term961.getClass(), "next", null);
        setField(term961, term961.getClass(), "first", null);
        setField(term961, term961.getClass(), "last", null);
        setField(term961, term961.getClass(), "propListHead", null);
        setIntField(term961, term961.getClass(), "sourcePosition", 0);
        setField(term961, term961.getClass(), "jsType", null);
        setField(term961, term961.getClass(), "parent", null);
        setField(term953, term953.getClass(), "last", term961);
        setField(term964, term964.getClass(), "next", null);
        setIntField(term964, term964.getClass(), "type", 0);
        setIntField(term964, term964.getClass(), "intValue", 0);
        setField(term964, term964.getClass(), "objectValue", null);
        setField(term953, term953.getClass(), "propListHead", term964);
        setIntField(term953, term953.getClass(), "sourcePosition", 320711637);
        setField(term953, term953.getClass(), "jsType", null);
        setField(term953, term953.getClass(), "parent", null);
        setField(term951, term951.getClass(), "next", term953);
        setIntField(term968, term968.getClass(), "type", 0);
        setField(term968, term968.getClass(), "next", null);
        setField(term968, term968.getClass(), "first", null);
        setField(term968, term968.getClass(), "last", null);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term951, term951.getClass(), "first", term968);
        setIntField(term971, term971.getClass(), "type", 0);
        setField(term971, term971.getClass(), "next", null);
        setField(term971, term971.getClass(), "first", null);
        setField(term971, term971.getClass(), "last", null);
        setField(term971, term971.getClass(), "propListHead", null);
        setIntField(term971, term971.getClass(), "sourcePosition", 0);
        setField(term971, term971.getClass(), "jsType", null);
        setField(term971, term971.getClass(), "parent", null);
        setField(term951, term951.getClass(), "last", term971);
        setField(term974, term974.getClass(), "next", null);
        setIntField(term974, term974.getClass(), "type", 0);
        setIntField(term974, term974.getClass(), "intValue", 0);
        setField(term974, term974.getClass(), "objectValue", null);
        setField(term951, term951.getClass(), "propListHead", term974);
        setIntField(term951, term951.getClass(), "sourcePosition", 1241164745);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        term8688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8694 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8698 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8688, term8688.getClass(), "type", -439048495);
        setIntField(term8690, term8690.getClass(), "type", 787278105);
        setIntField(term8691, term8691.getClass(), "type", 0);
        setField(term8691, term8691.getClass(), "next", null);
        setField(term8691, term8691.getClass(), "first", null);
        setField(term8691, term8691.getClass(), "last", null);
        setField(term8691, term8691.getClass(), "propListHead", null);
        setIntField(term8691, term8691.getClass(), "sourcePosition", 0);
        setField(term8691, term8691.getClass(), "jsType", null);
        setField(term8691, term8691.getClass(), "parent", null);
        setField(term8690, term8690.getClass(), "next", term8691);
        setIntField(term8692, term8692.getClass(), "type", 0);
        setField(term8692, term8692.getClass(), "next", null);
        setField(term8692, term8692.getClass(), "first", null);
        setField(term8692, term8692.getClass(), "last", null);
        setField(term8692, term8692.getClass(), "propListHead", null);
        setIntField(term8692, term8692.getClass(), "sourcePosition", 0);
        setField(term8692, term8692.getClass(), "jsType", null);
        setField(term8692, term8692.getClass(), "parent", null);
        setField(term8690, term8690.getClass(), "first", term8692);
        setIntField(term8693, term8693.getClass(), "type", 0);
        setField(term8693, term8693.getClass(), "next", null);
        setField(term8693, term8693.getClass(), "first", null);
        setField(term8693, term8693.getClass(), "last", null);
        setField(term8693, term8693.getClass(), "propListHead", null);
        setIntField(term8693, term8693.getClass(), "sourcePosition", 0);
        setField(term8693, term8693.getClass(), "jsType", null);
        setField(term8693, term8693.getClass(), "parent", null);
        setField(term8690, term8690.getClass(), "last", term8693);
        setField(term8694, term8694.getClass(), "next", null);
        setIntField(term8694, term8694.getClass(), "type", 0);
        setIntField(term8694, term8694.getClass(), "intValue", 0);
        setField(term8694, term8694.getClass(), "objectValue", null);
        setField(term8690, term8690.getClass(), "propListHead", term8694);
        setIntField(term8690, term8690.getClass(), "sourcePosition", 320711637);
        setField(term8690, term8690.getClass(), "jsType", null);
        setField(term8690, term8690.getClass(), "parent", null);
        setField(term8688, term8688.getClass(), "next", term8690);
        setIntField(term8695, term8695.getClass(), "type", 0);
        setField(term8695, term8695.getClass(), "next", null);
        setField(term8695, term8695.getClass(), "first", null);
        setField(term8695, term8695.getClass(), "last", null);
        setField(term8695, term8695.getClass(), "propListHead", null);
        setIntField(term8695, term8695.getClass(), "sourcePosition", 0);
        setField(term8695, term8695.getClass(), "jsType", null);
        setField(term8695, term8695.getClass(), "parent", null);
        setField(term8688, term8688.getClass(), "first", term8695);
        setIntField(term8696, term8696.getClass(), "type", 0);
        setField(term8696, term8696.getClass(), "next", null);
        setField(term8696, term8696.getClass(), "first", null);
        setField(term8696, term8696.getClass(), "last", null);
        setField(term8696, term8696.getClass(), "propListHead", null);
        setIntField(term8696, term8696.getClass(), "sourcePosition", 0);
        setField(term8696, term8696.getClass(), "jsType", null);
        setField(term8696, term8696.getClass(), "parent", null);
        setField(term8688, term8688.getClass(), "last", term8696);
        setField(term8698, term8698.getClass(), "next", null);
        setIntField(term8698, term8698.getClass(), "type", 0);
        setIntField(term8698, term8698.getClass(), "intValue", 0);
        setField(term8698, term8698.getClass(), "objectValue", null);
        setField(term8688, term8688.getClass(), "propListHead", term8698);
        setIntField(term8688, term8688.getClass(), "sourcePosition", 1241164745);
        setField(term8688, term8688.getClass(), "jsType", null);
        setField(term8688, term8688.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term951;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term951, term8688));
        assertTrue(recursiveEquals(retValue, false));
    }

};


