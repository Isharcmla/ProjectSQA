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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AmbiguateProperties_getIntForType_179361855013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public AmbiguateProperties_getIntForType_179361855013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term213, term213.getClass(), "type", -117576464);
        setIntField(term215, term215.getClass(), "type", 865208305);
        setField(term215, term215.getClass(), "next", null);
        setField(term215, term215.getClass(), "first", null);
        setField(term215, term215.getClass(), "last", null);
        setField(term215, term215.getClass(), "propListHead", null);
        setIntField(term215, term215.getClass(), "sourcePosition", -1275173084);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setField(term213, term213.getClass(), "next", term215);
        setIntField(term218, term218.getClass(), "type", 0);
        setField(term218, term218.getClass(), "next", null);
        setField(term218, term218.getClass(), "first", null);
        setField(term218, term218.getClass(), "last", null);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        setField(term213, term213.getClass(), "first", term218);
        setIntField(term221, term221.getClass(), "type", 0);
        setField(term221, term221.getClass(), "next", null);
        setField(term221, term221.getClass(), "first", null);
        setField(term221, term221.getClass(), "last", null);
        setField(term221, term221.getClass(), "propListHead", null);
        setIntField(term221, term221.getClass(), "sourcePosition", 0);
        setField(term221, term221.getClass(), "jsType", null);
        setField(term221, term221.getClass(), "parent", null);
        setField(term213, term213.getClass(), "last", term221);
        setField(term224, term224.getClass(), "next", null);
        setIntField(term224, term224.getClass(), "type", 0);
        setIntField(term224, term224.getClass(), "intValue", 0);
        setField(term224, term224.getClass(), "objectValue", null);
        setField(term213, term213.getClass(), "propListHead", term224);
        setIntField(term213, term213.getClass(), "sourcePosition", -244121226);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        ArrayList term211 = new ArrayList();
        ((ArrayList) term211).add(term213);
        HashMap term237 = new HashMap();
        HashMap term250 = new HashMap();
        Set<Object> term2044 =  ((Map) term250).keySet();
        HashSet term249 = new HashSet((Collection<? extends Object>) term2044);
        HashMap term265 = new HashMap();
        Set<Object> term2045 =  ((Map) term265).keySet();
        HashSet term264 = new HashSet((Collection<? extends Object>) term2045);
        HashMap term281 = new HashMap();
        HashMap term291 = new HashMap();
        term210 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term230 = (char[]) newCharArray(6);
        setField(term210, term210.getClass(), "compiler", null);
        setField(term210, term210.getClass(), "stringNodesToRename", term211);
        setCharElement(term230, 0, 's');
        setCharElement(term230, 1, 'j');
        setCharElement(term230, 2, 'l');
        setCharElement(term230, 3, 'J');
        setCharElement(term230, 4, 'A');
        setCharElement(term230, 5, 'E');
        setField(term210, term210.getClass(), "reservedCharacters", term230);
        setField(term210, term210.getClass(), "propertyMap", term237);
        setField(term210, term210.getClass(), "externedNames", term249);
        setField(term210, term210.getClass(), "quotedNames", term264);
        setField(term210, term210.getClass(), "renamingMap", term281);
        setField(term210, term210.getClass(), "colorMap", term291);
        setField(term210, term210.getClass(), "intForType", null);
        setField(term210, term210.getClass(), "relatedBitsets", null);
        setField(term210, term210.getClass(), "invalidatingTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getIntForType", argTypes, term210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


