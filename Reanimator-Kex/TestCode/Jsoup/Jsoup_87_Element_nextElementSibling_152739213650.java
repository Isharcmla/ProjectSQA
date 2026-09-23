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

public class Element_nextElementSibling_152739213650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3602;

    public Element_nextElementSibling_152739213650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3628 = new ArrayList();
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        term3602 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3603 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3624 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3625 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3626 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3634 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3635 = (Object[]) newArray("java.lang.String", 0);
        setField(term3603, term3603.getClass(), "tagName", "pORebkoRdD");
        setBooleanField(term3603, term3603.getClass(), "isBlock", false);
        setBooleanField(term3603, term3603.getClass(), "formatAsBlock", false);
        setBooleanField(term3603, term3603.getClass(), "canContainInline", false);
        setBooleanField(term3603, term3603.getClass(), "empty", false);
        setBooleanField(term3603, term3603.getClass(), "selfClosing", true);
        setBooleanField(term3603, term3603.getClass(), "preserveWhitespace", true);
        setBooleanField(term3603, term3603.getClass(), "formList", false);
        setBooleanField(term3603, term3603.getClass(), "formSubmit", true);
        setField(term3602, term3602.getClass(), "tag", term3603);
        setField(term3624, term3624.getClass(), "referent", null);
        setField(term3625, term3625.getClass(), "lock", term3626);
        setField(term3625, term3625.getClass(), "head", null);
        setLongField(term3625, term3625.getClass(), "queueLength", -4443169559037975007L);
        setField(term3624, term3624.getClass(), "queue", term3625);
        setField(term3624, term3624.getClass(), "next", null);
        setField(term3624, term3624.getClass(), "discovered", null);
        setField(term3602, term3602.getClass(), "shadowChildrenRef", term3624);
        setField(term3602, term3602.getClass(), "childNodes", term3628);
        setIntField(term3632, term3632.getClass(), "size", -1347665717);
        setField(term3632, term3632.getClass(), "keys", term3634);
        setField(term3632, term3632.getClass(), "vals", term3635);
        setField(term3602, term3602.getClass(), "attributes", term3632);
        setField(term3602, term3602.getClass(), "baseUri", "mXGCWJDOqA");
        setField(term3602, term3602.getClass(), "parentNode", null);
        setIntField(term3602, term3602.getClass(), "siblingIndex", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextElementSibling", argTypes, term3602, args);
    }

};


