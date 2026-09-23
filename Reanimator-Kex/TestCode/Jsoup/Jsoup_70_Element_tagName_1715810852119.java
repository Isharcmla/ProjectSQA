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

public class Element_tagName_1715810852119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term57088;

    public Element_tagName_1715810852119() {
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
        ArrayList term57095 = new ArrayList();
        ((ArrayList) term57095).add((Object)null);
        ((ArrayList) term57095).add((Object)null);
        ((ArrayList) term57095).add((Object)null);
        ((ArrayList) term57095).add((Object)null);
        ((ArrayList) term57095).add((Object)null);
        ((ArrayList) term57095).add((Object)null);
        term57088 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57089 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57092 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57093 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57094 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57097 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57098 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57099 = (Object[]) newArray("java.lang.String", 0);
        setField(term57089, term57089.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term57089, term57089.getClass(), "isBlock", false);
        setBooleanField(term57089, term57089.getClass(), "formatAsBlock", false);
        setBooleanField(term57089, term57089.getClass(), "canContainInline", false);
        setBooleanField(term57089, term57089.getClass(), "empty", true);
        setBooleanField(term57089, term57089.getClass(), "selfClosing", false);
        setBooleanField(term57089, term57089.getClass(), "preserveWhitespace", false);
        setBooleanField(term57089, term57089.getClass(), "formList", true);
        setBooleanField(term57089, term57089.getClass(), "formSubmit", false);
        setField(term57088, term57088.getClass(), "tag", term57089);
        setField(term57092, term57092.getClass(), "referent", null);
        setField(term57093, term57093.getClass(), "lock", term57094);
        setField(term57093, term57093.getClass(), "head", null);
        setLongField(term57093, term57093.getClass(), "queueLength", 6811161968424632369L);
        setField(term57092, term57092.getClass(), "queue", term57093);
        setField(term57092, term57092.getClass(), "next", null);
        setField(term57092, term57092.getClass(), "discovered", null);
        setField(term57088, term57088.getClass(), "shadowChildrenRef", term57092);
        setField(term57088, term57088.getClass(), "childNodes", term57095);
        setIntField(term57097, term57097.getClass(), "size", 597278769);
        setField(term57097, term57097.getClass(), "keys", term57098);
        setField(term57097, term57097.getClass(), "vals", term57099);
        setField(term57088, term57088.getClass(), "attributes", term57097);
        setField(term57088, term57088.getClass(), "baseUri", "RkybSrpybU");
        setField(term57088, term57088.getClass(), "parentNode", null);
        setIntField(term57088, term57088.getClass(), "siblingIndex", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term624, args);
        assertTrue(recursiveEquals(term624, term57088));
        assertTrue(recursiveEquals(retValue, "hNxWaHcfhY"));
    }

};


