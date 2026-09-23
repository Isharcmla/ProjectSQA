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

public class Element_tagName_1715810852121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term57277;

    public Element_tagName_1715810852121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term650 = new ArrayList();
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        term624 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term646 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term647 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term648 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term654 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term656 = (Object[]) newArray("java.lang.String", 0);
        Object[] term657 = (Object[]) newArray("java.lang.String", 0);
        setField(term625, term625.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term625, term625.getClass(), "isBlock", false);
        setBooleanField(term625, term625.getClass(), "formatAsBlock", false);
        setBooleanField(term625, term625.getClass(), "canContainInline", false);
        setBooleanField(term625, term625.getClass(), "empty", true);
        setBooleanField(term625, term625.getClass(), "selfClosing", false);
        setBooleanField(term625, term625.getClass(), "preserveWhitespace", false);
        setBooleanField(term625, term625.getClass(), "formList", true);
        setBooleanField(term625, term625.getClass(), "formSubmit", false);
        setField(term624, term624.getClass(), "tag", term625);
        setField(term646, term646.getClass(), "referent", null);
        setField(term647, term647.getClass(), "lock", term648);
        setField(term647, term647.getClass(), "head", null);
        setLongField(term647, term647.getClass(), "queueLength", 6811161968424632369L);
        setField(term646, term646.getClass(), "queue", term647);
        setField(term646, term646.getClass(), "next", null);
        setField(term646, term646.getClass(), "discovered", null);
        setField(term624, term624.getClass(), "shadowChildrenRef", term646);
        setField(term624, term624.getClass(), "childNodes", term650);
        setIntField(term654, term654.getClass(), "size", 597278769);
        setField(term654, term654.getClass(), "keys", term656);
        setField(term654, term654.getClass(), "vals", term657);
        setField(term624, term624.getClass(), "attributes", term654);
        setField(term624, term624.getClass(), "baseUri", "RkybSrpybU");
        setField(term624, term624.getClass(), "parentNode", null);
        setIntField(term624, term624.getClass(), "siblingIndex", -1685132342);
        ArrayList term57284 = new ArrayList();
        ((ArrayList) term57284).add((Object)null);
        ((ArrayList) term57284).add((Object)null);
        ((ArrayList) term57284).add((Object)null);
        ((ArrayList) term57284).add((Object)null);
        ((ArrayList) term57284).add((Object)null);
        ((ArrayList) term57284).add((Object)null);
        term57277 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57278 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57281 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57282 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57283 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57286 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57287 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57288 = (Object[]) newArray("java.lang.String", 0);
        setField(term57278, term57278.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term57278, term57278.getClass(), "isBlock", false);
        setBooleanField(term57278, term57278.getClass(), "formatAsBlock", false);
        setBooleanField(term57278, term57278.getClass(), "canContainInline", false);
        setBooleanField(term57278, term57278.getClass(), "empty", true);
        setBooleanField(term57278, term57278.getClass(), "selfClosing", false);
        setBooleanField(term57278, term57278.getClass(), "preserveWhitespace", false);
        setBooleanField(term57278, term57278.getClass(), "formList", true);
        setBooleanField(term57278, term57278.getClass(), "formSubmit", false);
        setField(term57277, term57277.getClass(), "tag", term57278);
        setField(term57281, term57281.getClass(), "referent", null);
        setField(term57282, term57282.getClass(), "lock", term57283);
        setField(term57282, term57282.getClass(), "head", null);
        setLongField(term57282, term57282.getClass(), "queueLength", 6811161968424632369L);
        setField(term57281, term57281.getClass(), "queue", term57282);
        setField(term57281, term57281.getClass(), "next", null);
        setField(term57281, term57281.getClass(), "discovered", null);
        setField(term57277, term57277.getClass(), "shadowChildrenRef", term57281);
        setField(term57277, term57277.getClass(), "childNodes", term57284);
        setIntField(term57286, term57286.getClass(), "size", 597278769);
        setField(term57286, term57286.getClass(), "keys", term57287);
        setField(term57286, term57286.getClass(), "vals", term57288);
        setField(term57277, term57277.getClass(), "attributes", term57286);
        setField(term57277, term57277.getClass(), "baseUri", "RkybSrpybU");
        setField(term57277, term57277.getClass(), "parentNode", null);
        setIntField(term57277, term57277.getClass(), "siblingIndex", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term624, args);
        assertTrue(recursiveEquals(term624, term57277));
        assertTrue(recursiveEquals(retValue, "hNxWaHcfhY"));
    }

};


