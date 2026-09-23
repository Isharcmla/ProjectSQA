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
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeValueEnding_60454231567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4988;

    public Element_getElementsByAttributeValueEnding_60454231567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5014 = new ArrayList();
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        ((ArrayList) term5014).add((Object)null);
        term4988 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4989 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5010 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5011 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5012 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5018 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5020 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5021 = (Object[]) newArray("java.lang.String", 0);
        setField(term4989, term4989.getClass(), "tagName", "DbiCVtPPCT");
        setBooleanField(term4989, term4989.getClass(), "isBlock", true);
        setBooleanField(term4989, term4989.getClass(), "formatAsBlock", false);
        setBooleanField(term4989, term4989.getClass(), "canContainInline", true);
        setBooleanField(term4989, term4989.getClass(), "empty", true);
        setBooleanField(term4989, term4989.getClass(), "selfClosing", true);
        setBooleanField(term4989, term4989.getClass(), "preserveWhitespace", false);
        setBooleanField(term4989, term4989.getClass(), "formList", false);
        setBooleanField(term4989, term4989.getClass(), "formSubmit", false);
        setField(term4988, term4988.getClass(), "tag", term4989);
        setField(term5010, term5010.getClass(), "referent", null);
        setField(term5011, term5011.getClass(), "lock", term5012);
        setField(term5011, term5011.getClass(), "head", null);
        setLongField(term5011, term5011.getClass(), "queueLength", -8658027316505137504L);
        setField(term5010, term5010.getClass(), "queue", term5011);
        setField(term5010, term5010.getClass(), "next", null);
        setField(term5010, term5010.getClass(), "discovered", null);
        setField(term4988, term4988.getClass(), "shadowChildrenRef", term5010);
        setField(term4988, term4988.getClass(), "childNodes", term5014);
        setIntField(term5018, term5018.getClass(), "size", 107945604);
        setField(term5018, term5018.getClass(), "keys", term5020);
        setField(term5018, term5018.getClass(), "vals", term5021);
        setField(term4988, term4988.getClass(), "attributes", term5018);
        setField(term4988, term4988.getClass(), "baseUri", "WzFopsaDuG");
        setField(term4988, term4988.getClass(), "parentNode", null);
        setIntField(term4988, term4988.getClass(), "siblingIndex", -1963464809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PapWxkhEWe";
        args[1] = "smnHEqRFRx";
        callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4988, args);
    }

};


