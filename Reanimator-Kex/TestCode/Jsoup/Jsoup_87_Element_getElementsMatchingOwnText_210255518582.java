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

public class Element_getElementsMatchingOwnText_210255518582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6434;

    public Element_getElementsMatchingOwnText_210255518582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6460 = new ArrayList();
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        ((ArrayList) term6460).add((Object)null);
        term6434 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6435 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6456 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6457 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6458 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6464 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6466 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6467 = (Object[]) newArray("java.lang.String", 0);
        setField(term6435, term6435.getClass(), "tagName", "tlzpzIjMib");
        setBooleanField(term6435, term6435.getClass(), "isBlock", false);
        setBooleanField(term6435, term6435.getClass(), "formatAsBlock", false);
        setBooleanField(term6435, term6435.getClass(), "canContainInline", true);
        setBooleanField(term6435, term6435.getClass(), "empty", false);
        setBooleanField(term6435, term6435.getClass(), "selfClosing", true);
        setBooleanField(term6435, term6435.getClass(), "preserveWhitespace", true);
        setBooleanField(term6435, term6435.getClass(), "formList", true);
        setBooleanField(term6435, term6435.getClass(), "formSubmit", true);
        setField(term6434, term6434.getClass(), "tag", term6435);
        setField(term6456, term6456.getClass(), "referent", null);
        setField(term6457, term6457.getClass(), "lock", term6458);
        setField(term6457, term6457.getClass(), "head", null);
        setLongField(term6457, term6457.getClass(), "queueLength", 9013624480170062917L);
        setField(term6456, term6456.getClass(), "queue", term6457);
        setField(term6456, term6456.getClass(), "next", null);
        setField(term6456, term6456.getClass(), "discovered", null);
        setField(term6434, term6434.getClass(), "shadowChildrenRef", term6456);
        setField(term6434, term6434.getClass(), "childNodes", term6460);
        setIntField(term6464, term6464.getClass(), "size", 199287428);
        setField(term6464, term6464.getClass(), "keys", term6466);
        setField(term6464, term6464.getClass(), "vals", term6467);
        setField(term6434, term6434.getClass(), "attributes", term6464);
        setField(term6434, term6434.getClass(), "baseUri", "AZdLeSugwv");
        setField(term6434, term6434.getClass(), "parentNode", null);
        setIntField(term6434, term6434.getClass(), "siblingIndex", -1195339592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMsXuyzKJV";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term6434, args);
    }

};


