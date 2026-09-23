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
import java.lang.StringIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_appendListItem_194071392134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;
     Object term824;

    public NameAnalyzer_appendListItem_194071392134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term770 = new HashMap();
        HashMap term786 = new HashMap();
        Set<Object> term7806 =  ((Map) term786).keySet();
        HashSet term785 = new HashSet((Collection<? extends Object>) term7806);
        ArrayList term797 = new ArrayList();
        HashMap term802 = new HashMap();
        Set<Object> term7807 =  ((Map) term802).keySet();
        HashSet term801 = new HashSet((Collection<? extends Object>) term7807);
        ArrayList term810 = new ArrayList();
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        ((ArrayList) term810).add((Object)null);
        HashMap term814 = new HashMap();
        term769 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term796 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term769, term769.getClass(), "compiler", null);
        setField(term769, term769.getClass(), "allNames", term770);
        setField(term769, term769.getClass(), "referenceGraph", null);
        setField(term769, term769.getClass(), "scopes", null);
        setBooleanField(term769, term769.getClass(), "removeUnreferenced", true);
        setField(term769, term769.getClass(), "globalNames", term785);
        setField(term796, term796.getClass(), "listeners", term797);
        setField(term769, term769.getClass(), "changeProxy", term796);
        setField(term769, term769.getClass(), "externalNames", term801);
        setField(term769, term769.getClass(), "refNodes", term810);
        setField(term769, term769.getClass(), "aliases", term814);
        term824 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term825 = (byte[]) newByteArray(16);
        setField(term824, term824.getClass(), "value", term825);
        setByteField(term824, term824.getClass(), "coder", (byte) 47);
        setIntField(term824, term824.getClass(), "count", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term824;
        args[1] = "bWWfajKbEX";
        try {
            callMethod(klass, "appendListItem", argTypes, term769, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


