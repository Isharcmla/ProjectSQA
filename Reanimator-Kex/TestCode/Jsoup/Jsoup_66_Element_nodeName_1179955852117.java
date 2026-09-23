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
import java.lang.Object;
import java.util.ArrayList;

public class Element_nodeName_1179955852117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;
     Object term10600;

    public Element_nodeName_1179955852117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        term557 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term558 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term579 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term580 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term581 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589 = (Object[]) newArray("java.lang.String", 0);
        Object[] term590 = (Object[]) newArray("java.lang.String", 0);
        setField(term558, term558.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term558, term558.getClass(), "isBlock", false);
        setBooleanField(term558, term558.getClass(), "formatAsBlock", true);
        setBooleanField(term558, term558.getClass(), "canContainInline", true);
        setBooleanField(term558, term558.getClass(), "empty", true);
        setBooleanField(term558, term558.getClass(), "selfClosing", false);
        setBooleanField(term558, term558.getClass(), "preserveWhitespace", false);
        setBooleanField(term558, term558.getClass(), "formList", false);
        setBooleanField(term558, term558.getClass(), "formSubmit", false);
        setField(term557, term557.getClass(), "tag", term558);
        setField(term579, term579.getClass(), "referent", null);
        setField(term580, term580.getClass(), "lock", term581);
        setField(term580, term580.getClass(), "head", null);
        setLongField(term580, term580.getClass(), "queueLength", 4872422362414183754L);
        setField(term579, term579.getClass(), "queue", term580);
        setField(term579, term579.getClass(), "next", null);
        setField(term579, term579.getClass(), "discovered", null);
        setField(term557, term557.getClass(), "shadowChildrenRef", term579);
        setField(term557, term557.getClass(), "childNodes", term583);
        setIntField(term587, term587.getClass(), "size", -883034806);
        setField(term587, term587.getClass(), "keys", term589);
        setField(term587, term587.getClass(), "vals", term590);
        setField(term557, term557.getClass(), "attributes", term587);
        setField(term557, term557.getClass(), "baseUri", "pCTimMblYc");
        setField(term557, term557.getClass(), "parentNode", null);
        setIntField(term557, term557.getClass(), "siblingIndex", 1585847225);
        ArrayList term10607 = new ArrayList();
        ((ArrayList) term10607).add((Object)null);
        ((ArrayList) term10607).add((Object)null);
        term10600 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10601 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10604 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10605 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10606 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10609 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10610 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10611 = (Object[]) newArray("java.lang.String", 0);
        setField(term10601, term10601.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term10601, term10601.getClass(), "isBlock", false);
        setBooleanField(term10601, term10601.getClass(), "formatAsBlock", true);
        setBooleanField(term10601, term10601.getClass(), "canContainInline", true);
        setBooleanField(term10601, term10601.getClass(), "empty", true);
        setBooleanField(term10601, term10601.getClass(), "selfClosing", false);
        setBooleanField(term10601, term10601.getClass(), "preserveWhitespace", false);
        setBooleanField(term10601, term10601.getClass(), "formList", false);
        setBooleanField(term10601, term10601.getClass(), "formSubmit", false);
        setField(term10600, term10600.getClass(), "tag", term10601);
        setField(term10604, term10604.getClass(), "referent", null);
        setField(term10605, term10605.getClass(), "lock", term10606);
        setField(term10605, term10605.getClass(), "head", null);
        setLongField(term10605, term10605.getClass(), "queueLength", 4872422362414183754L);
        setField(term10604, term10604.getClass(), "queue", term10605);
        setField(term10604, term10604.getClass(), "next", null);
        setField(term10604, term10604.getClass(), "discovered", null);
        setField(term10600, term10600.getClass(), "shadowChildrenRef", term10604);
        setField(term10600, term10600.getClass(), "childNodes", term10607);
        setIntField(term10609, term10609.getClass(), "size", -883034806);
        setField(term10609, term10609.getClass(), "keys", term10610);
        setField(term10609, term10609.getClass(), "vals", term10611);
        setField(term10600, term10600.getClass(), "attributes", term10609);
        setField(term10600, term10600.getClass(), "baseUri", "pCTimMblYc");
        setField(term10600, term10600.getClass(), "parentNode", null);
        setIntField(term10600, term10600.getClass(), "siblingIndex", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term557, args);
        assertTrue(recursiveEquals(term557, term10600));
        assertTrue(recursiveEquals(retValue, "HyxfbSQYBe"));
    }

};


