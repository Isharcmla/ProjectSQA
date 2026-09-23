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

public class Element_appendWhitespaceIfBr_63120937585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6578;
     Object term6625;

    public Element_appendWhitespaceIfBr_63120937585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6604 = new ArrayList();
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        term6578 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6600 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6601 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6602 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6608 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6610 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6611 = (Object[]) newArray("java.lang.String", 0);
        setField(term6579, term6579.getClass(), "tagName", "QduALnDSVo");
        setBooleanField(term6579, term6579.getClass(), "isBlock", false);
        setBooleanField(term6579, term6579.getClass(), "formatAsBlock", false);
        setBooleanField(term6579, term6579.getClass(), "canContainInline", false);
        setBooleanField(term6579, term6579.getClass(), "empty", false);
        setBooleanField(term6579, term6579.getClass(), "selfClosing", false);
        setBooleanField(term6579, term6579.getClass(), "preserveWhitespace", false);
        setBooleanField(term6579, term6579.getClass(), "formList", false);
        setBooleanField(term6579, term6579.getClass(), "formSubmit", true);
        setField(term6578, term6578.getClass(), "tag", term6579);
        setField(term6600, term6600.getClass(), "referent", null);
        setField(term6601, term6601.getClass(), "lock", term6602);
        setField(term6601, term6601.getClass(), "head", null);
        setLongField(term6601, term6601.getClass(), "queueLength", 50358265865610362L);
        setField(term6600, term6600.getClass(), "queue", term6601);
        setField(term6600, term6600.getClass(), "next", null);
        setField(term6600, term6600.getClass(), "discovered", null);
        setField(term6578, term6578.getClass(), "shadowChildrenRef", term6600);
        setField(term6578, term6578.getClass(), "childNodes", term6604);
        setIntField(term6608, term6608.getClass(), "size", 1270666529);
        setField(term6608, term6608.getClass(), "keys", term6610);
        setField(term6608, term6608.getClass(), "vals", term6611);
        setField(term6578, term6578.getClass(), "attributes", term6608);
        setField(term6578, term6578.getClass(), "baseUri", "izPpKDErnQ");
        setField(term6578, term6578.getClass(), "parentNode", null);
        setIntField(term6578, term6578.getClass(), "siblingIndex", -1146679443);
        term6625 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6626 = (byte[]) newByteArray(16);
        setField(term6625, term6625.getClass(), "value", term6626);
        setByteField(term6625, term6625.getClass(), "coder", (byte) 89);
        setIntField(term6625, term6625.getClass(), "count", -860131894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6578;
        args[1] = term6625;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


