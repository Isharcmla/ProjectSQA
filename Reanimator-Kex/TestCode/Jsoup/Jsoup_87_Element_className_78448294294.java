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

public class Element_className_78448294294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7259;

    public Element_className_78448294294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7285 = new ArrayList();
        ((ArrayList) term7285).add((Object)null);
        ((ArrayList) term7285).add((Object)null);
        term7259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7281 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7282 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7283 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7291 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7292 = (Object[]) newArray("java.lang.String", 0);
        setField(term7260, term7260.getClass(), "tagName", "gUvcueTURF");
        setBooleanField(term7260, term7260.getClass(), "isBlock", true);
        setBooleanField(term7260, term7260.getClass(), "formatAsBlock", true);
        setBooleanField(term7260, term7260.getClass(), "canContainInline", true);
        setBooleanField(term7260, term7260.getClass(), "empty", true);
        setBooleanField(term7260, term7260.getClass(), "selfClosing", false);
        setBooleanField(term7260, term7260.getClass(), "preserveWhitespace", true);
        setBooleanField(term7260, term7260.getClass(), "formList", false);
        setBooleanField(term7260, term7260.getClass(), "formSubmit", false);
        setField(term7259, term7259.getClass(), "tag", term7260);
        setField(term7281, term7281.getClass(), "referent", null);
        setField(term7282, term7282.getClass(), "lock", term7283);
        setField(term7282, term7282.getClass(), "head", null);
        setLongField(term7282, term7282.getClass(), "queueLength", 2848819812340321742L);
        setField(term7281, term7281.getClass(), "queue", term7282);
        setField(term7281, term7281.getClass(), "next", null);
        setField(term7281, term7281.getClass(), "discovered", null);
        setField(term7259, term7259.getClass(), "shadowChildrenRef", term7281);
        setField(term7259, term7259.getClass(), "childNodes", term7285);
        setIntField(term7289, term7289.getClass(), "size", -1070592289);
        setField(term7289, term7289.getClass(), "keys", term7291);
        setField(term7289, term7289.getClass(), "vals", term7292);
        setField(term7259, term7259.getClass(), "attributes", term7289);
        setField(term7259, term7259.getClass(), "baseUri", "EwQBhZjCIT");
        setField(term7259, term7259.getClass(), "parentNode", null);
        setIntField(term7259, term7259.getClass(), "siblingIndex", -1464172784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term7259, args);
    }

};


