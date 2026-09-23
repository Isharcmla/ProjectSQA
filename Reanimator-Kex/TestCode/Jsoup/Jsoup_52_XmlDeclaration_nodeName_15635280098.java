package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class XmlDeclaration_nodeName_15635280098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term1148;

    public XmlDeclaration_nodeName_15635280098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61 = new ArrayList();
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        LinkedHashMap term66 = new LinkedHashMap();
        term47 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term65 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term47, term47.getClass(), "name", "MuLcgQHgqz");
        setBooleanField(term47, term47.getClass(), "isProcessingInstruction", false);
        setField(term47, term47.getClass(), "parentNode", null);
        setField(term47, term47.getClass(), "childNodes", term61);
        setField(term65, term65.getClass(), "attributes", term66);
        setField(term47, term47.getClass(), "attributes", term65);
        setField(term47, term47.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term47, term47.getClass(), "siblingIndex", 568599855);
        ArrayList term1151 = new ArrayList();
        ((ArrayList) term1151).add((Object)null);
        ((ArrayList) term1151).add((Object)null);
        ((ArrayList) term1151).add((Object)null);
        ((ArrayList) term1151).add((Object)null);
        ((ArrayList) term1151).add((Object)null);
        LinkedHashMap term1154 = new LinkedHashMap();
        term1148 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term1153 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1148, term1148.getClass(), "name", "MuLcgQHgqz");
        setBooleanField(term1148, term1148.getClass(), "isProcessingInstruction", false);
        setField(term1148, term1148.getClass(), "parentNode", null);
        setField(term1148, term1148.getClass(), "childNodes", term1151);
        setField(term1153, term1153.getClass(), "attributes", term1154);
        setField(term1148, term1148.getClass(), "attributes", term1153);
        setField(term1148, term1148.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term1148, term1148.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term1148));
        assertTrue(recursiveEquals(retValue, "#declaration"));
    }

};


