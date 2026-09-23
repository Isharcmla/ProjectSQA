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

public class Element_clone_1145458980106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55503;

    public Element_clone_1145458980106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55529 = new ArrayList();
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        ((ArrayList) term55529).add((Object)null);
        term55503 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55504 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55525 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55526 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55527 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55533 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55535 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55536 = (Object[]) newArray("java.lang.String", 0);
        setField(term55504, term55504.getClass(), "tagName", "ypEdrstygY");
        setBooleanField(term55504, term55504.getClass(), "isBlock", false);
        setBooleanField(term55504, term55504.getClass(), "formatAsBlock", true);
        setBooleanField(term55504, term55504.getClass(), "canContainInline", false);
        setBooleanField(term55504, term55504.getClass(), "empty", false);
        setBooleanField(term55504, term55504.getClass(), "selfClosing", false);
        setBooleanField(term55504, term55504.getClass(), "preserveWhitespace", true);
        setBooleanField(term55504, term55504.getClass(), "formList", true);
        setBooleanField(term55504, term55504.getClass(), "formSubmit", false);
        setField(term55503, term55503.getClass(), "tag", term55504);
        setField(term55525, term55525.getClass(), "referent", null);
        setField(term55526, term55526.getClass(), "lock", term55527);
        setField(term55526, term55526.getClass(), "head", null);
        setLongField(term55526, term55526.getClass(), "queueLength", 4949335493504695457L);
        setField(term55525, term55525.getClass(), "queue", term55526);
        setField(term55525, term55525.getClass(), "next", null);
        setField(term55525, term55525.getClass(), "discovered", null);
        setField(term55503, term55503.getClass(), "shadowChildrenRef", term55525);
        setField(term55503, term55503.getClass(), "childNodes", term55529);
        setIntField(term55533, term55533.getClass(), "size", 306847454);
        setField(term55533, term55533.getClass(), "keys", term55535);
        setField(term55533, term55533.getClass(), "vals", term55536);
        setField(term55503, term55503.getClass(), "attributes", term55533);
        setField(term55503, term55503.getClass(), "baseUri", "sNQFlATEeQ");
        setField(term55503, term55503.getClass(), "parentNode", null);
        setIntField(term55503, term55503.getClass(), "siblingIndex", 1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term55503, args);
    }

};


