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

public class AmbiguateProperties_getJSType_148719138219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;
     Object term975;

    public AmbiguateProperties_getJSType_148719138219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term880, term880.getClass(), "type", 339854490);
        setIntField(term882, term882.getClass(), "type", 1532716628);
        setField(term882, term882.getClass(), "next", null);
        setField(term882, term882.getClass(), "first", null);
        setField(term882, term882.getClass(), "last", null);
        setField(term882, term882.getClass(), "propListHead", null);
        setIntField(term882, term882.getClass(), "sourcePosition", -1801760683);
        setField(term882, term882.getClass(), "jsType", null);
        setField(term882, term882.getClass(), "parent", null);
        setField(term880, term880.getClass(), "next", term882);
        setIntField(term885, term885.getClass(), "type", 0);
        setField(term885, term885.getClass(), "next", null);
        setField(term885, term885.getClass(), "first", null);
        setField(term885, term885.getClass(), "last", null);
        setField(term885, term885.getClass(), "propListHead", null);
        setIntField(term885, term885.getClass(), "sourcePosition", 0);
        setField(term885, term885.getClass(), "jsType", null);
        setField(term885, term885.getClass(), "parent", null);
        setField(term880, term880.getClass(), "first", term885);
        setIntField(term888, term888.getClass(), "type", 0);
        setField(term888, term888.getClass(), "next", null);
        setField(term888, term888.getClass(), "first", null);
        setField(term888, term888.getClass(), "last", null);
        setField(term888, term888.getClass(), "propListHead", null);
        setIntField(term888, term888.getClass(), "sourcePosition", 0);
        setField(term888, term888.getClass(), "jsType", null);
        setField(term888, term888.getClass(), "parent", null);
        setField(term880, term880.getClass(), "last", term888);
        setField(term891, term891.getClass(), "next", null);
        setIntField(term891, term891.getClass(), "type", 0);
        setIntField(term891, term891.getClass(), "intValue", 0);
        setField(term891, term891.getClass(), "objectValue", null);
        setField(term880, term880.getClass(), "propListHead", term891);
        setIntField(term880, term880.getClass(), "sourcePosition", 1141317871);
        setField(term880, term880.getClass(), "jsType", null);
        setField(term880, term880.getClass(), "parent", null);
        Object term895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term895, term895.getClass(), "type", 0);
        setField(term895, term895.getClass(), "next", null);
        setField(term895, term895.getClass(), "first", null);
        setField(term895, term895.getClass(), "last", null);
        setField(term895, term895.getClass(), "propListHead", null);
        setIntField(term895, term895.getClass(), "sourcePosition", 0);
        setField(term895, term895.getClass(), "jsType", null);
        setField(term895, term895.getClass(), "parent", null);
        Object term898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term898, term898.getClass(), "type", 0);
        setField(term898, term898.getClass(), "next", null);
        setField(term898, term898.getClass(), "first", null);
        setField(term898, term898.getClass(), "last", null);
        setField(term898, term898.getClass(), "propListHead", null);
        setIntField(term898, term898.getClass(), "sourcePosition", 0);
        setField(term898, term898.getClass(), "jsType", null);
        setField(term898, term898.getClass(), "parent", null);
        Object term901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term901, term901.getClass(), "type", 0);
        setField(term901, term901.getClass(), "next", null);
        setField(term901, term901.getClass(), "first", null);
        setField(term901, term901.getClass(), "last", null);
        setField(term901, term901.getClass(), "propListHead", null);
        setIntField(term901, term901.getClass(), "sourcePosition", 0);
        setField(term901, term901.getClass(), "jsType", null);
        setField(term901, term901.getClass(), "parent", null);
        ArrayList term878 = new ArrayList();
        ((ArrayList) term878).add(term880);
        ((ArrayList) term878).add(term895);
        ((ArrayList) term878).add(term898);
        ((ArrayList) term878).add(term901);
        ((ArrayList) term878).add(term895);
        HashMap term910 = new HashMap();
        HashMap term923 = new HashMap();
        Set<Object> term4647 =  ((Map) term923).keySet();
        HashSet term922 = new HashSet((Collection<? extends Object>) term4647);
        HashMap term940 = new HashMap();
        Set<Object> term4648 =  ((Map) term940).keySet();
        HashSet term939 = new HashSet((Collection<? extends Object>) term4648);
        HashMap term954 = new HashMap();
        HashMap term964 = new HashMap();
        term877 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term906 = (char[]) newCharArray(3);
        setField(term877, term877.getClass(), "compiler", null);
        setField(term877, term877.getClass(), "stringNodesToRename", term878);
        setCharElement(term906, 0, 'a');
        setCharElement(term906, 1, 'n');
        setCharElement(term906, 2, 'W');
        setField(term877, term877.getClass(), "reservedCharacters", term906);
        setField(term877, term877.getClass(), "propertyMap", term910);
        setField(term877, term877.getClass(), "externedNames", term922);
        setField(term877, term877.getClass(), "quotedNames", term939);
        setField(term877, term877.getClass(), "renamingMap", term954);
        setField(term877, term877.getClass(), "colorMap", term964);
        setField(term877, term877.getClass(), "intForType", null);
        setField(term877, term877.getClass(), "relatedBitsets", null);
        setField(term877, term877.getClass(), "invalidatingTypes", null);
        term975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term988 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term998 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term975, term975.getClass(), "type", -1963434938);
        setIntField(term977, term977.getClass(), "type", 1072005683);
        setIntField(term979, term979.getClass(), "type", 0);
        setField(term979, term979.getClass(), "next", null);
        setField(term979, term979.getClass(), "first", null);
        setField(term979, term979.getClass(), "last", null);
        setField(term979, term979.getClass(), "propListHead", null);
        setIntField(term979, term979.getClass(), "sourcePosition", 0);
        setField(term979, term979.getClass(), "jsType", null);
        setField(term979, term979.getClass(), "parent", null);
        setField(term977, term977.getClass(), "next", term979);
        setIntField(term982, term982.getClass(), "type", 0);
        setField(term982, term982.getClass(), "next", null);
        setField(term982, term982.getClass(), "first", null);
        setField(term982, term982.getClass(), "last", null);
        setField(term982, term982.getClass(), "propListHead", null);
        setIntField(term982, term982.getClass(), "sourcePosition", 0);
        setField(term982, term982.getClass(), "jsType", null);
        setField(term982, term982.getClass(), "parent", null);
        setField(term977, term977.getClass(), "first", term982);
        setIntField(term985, term985.getClass(), "type", 0);
        setField(term985, term985.getClass(), "next", null);
        setField(term985, term985.getClass(), "first", null);
        setField(term985, term985.getClass(), "last", null);
        setField(term985, term985.getClass(), "propListHead", null);
        setIntField(term985, term985.getClass(), "sourcePosition", 0);
        setField(term985, term985.getClass(), "jsType", null);
        setField(term985, term985.getClass(), "parent", null);
        setField(term977, term977.getClass(), "last", term985);
        setField(term988, term988.getClass(), "next", null);
        setIntField(term988, term988.getClass(), "type", 0);
        setIntField(term988, term988.getClass(), "intValue", 0);
        setField(term988, term988.getClass(), "objectValue", null);
        setField(term977, term977.getClass(), "propListHead", term988);
        setIntField(term977, term977.getClass(), "sourcePosition", 568954359);
        setField(term977, term977.getClass(), "jsType", null);
        setField(term977, term977.getClass(), "parent", null);
        setField(term975, term975.getClass(), "next", term977);
        setIntField(term992, term992.getClass(), "type", 0);
        setField(term992, term992.getClass(), "next", null);
        setField(term992, term992.getClass(), "first", null);
        setField(term992, term992.getClass(), "last", null);
        setField(term992, term992.getClass(), "propListHead", null);
        setIntField(term992, term992.getClass(), "sourcePosition", 0);
        setField(term992, term992.getClass(), "jsType", null);
        setField(term992, term992.getClass(), "parent", null);
        setField(term975, term975.getClass(), "first", term992);
        setIntField(term995, term995.getClass(), "type", 0);
        setField(term995, term995.getClass(), "next", null);
        setField(term995, term995.getClass(), "first", null);
        setField(term995, term995.getClass(), "last", null);
        setField(term995, term995.getClass(), "propListHead", null);
        setIntField(term995, term995.getClass(), "sourcePosition", 0);
        setField(term995, term995.getClass(), "jsType", null);
        setField(term995, term995.getClass(), "parent", null);
        setField(term975, term975.getClass(), "last", term995);
        setField(term998, term998.getClass(), "next", null);
        setIntField(term998, term998.getClass(), "type", 0);
        setIntField(term998, term998.getClass(), "intValue", 0);
        setField(term998, term998.getClass(), "objectValue", null);
        setField(term975, term975.getClass(), "propListHead", term998);
        setIntField(term975, term975.getClass(), "sourcePosition", 53410913);
        setField(term975, term975.getClass(), "jsType", null);
        setField(term975, term975.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term975;
        try {
            callMethod(klass, "getJSType", argTypes, term877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


