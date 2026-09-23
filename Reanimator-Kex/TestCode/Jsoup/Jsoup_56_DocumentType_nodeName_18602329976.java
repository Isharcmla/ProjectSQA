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

public class DocumentType_nodeName_18602329976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term1205;

    public DocumentType_nodeName_18602329976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term90 = new ArrayList();
        ((ArrayList) term90).add((Object)null);
        ((ArrayList) term90).add((Object)null);
        ((ArrayList) term90).add((Object)null);
        ((ArrayList) term90).add((Object)null);
        ((ArrayList) term90).add((Object)null);
        LinkedHashMap term95 = new LinkedHashMap();
        term89 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term94 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term89, term89.getClass(), "parentNode", null);
        setField(term89, term89.getClass(), "childNodes", term90);
        setField(term94, term94.getClass(), "attributes", term95);
        setField(term89, term89.getClass(), "attributes", term94);
        setField(term89, term89.getClass(), "baseUri", "MjGYSRKTNF");
        setIntField(term89, term89.getClass(), "siblingIndex", 568599855);
        ArrayList term1206 = new ArrayList();
        ((ArrayList) term1206).add((Object)null);
        ((ArrayList) term1206).add((Object)null);
        ((ArrayList) term1206).add((Object)null);
        ((ArrayList) term1206).add((Object)null);
        ((ArrayList) term1206).add((Object)null);
        LinkedHashMap term1209 = new LinkedHashMap();
        term1205 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term1208 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1205, term1205.getClass(), "parentNode", null);
        setField(term1205, term1205.getClass(), "childNodes", term1206);
        setField(term1208, term1208.getClass(), "attributes", term1209);
        setField(term1205, term1205.getClass(), "attributes", term1208);
        setField(term1205, term1205.getClass(), "baseUri", "MjGYSRKTNF");
        setIntField(term1205, term1205.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term89, args);
        assertTrue(recursiveEquals(term89, term1205));
        assertTrue(recursiveEquals(retValue, "#doctype"));
    }

};


