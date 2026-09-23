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

public class Element_toggleClass_95262400096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7379;

    public Element_toggleClass_95262400096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7405 = new ArrayList();
        ((ArrayList) term7405).add((Object)null);
        ((ArrayList) term7405).add((Object)null);
        ((ArrayList) term7405).add((Object)null);
        ((ArrayList) term7405).add((Object)null);
        term7379 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7401 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7402 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7403 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7409 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7411 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7412 = (Object[]) newArray("java.lang.String", 0);
        setField(term7380, term7380.getClass(), "tagName", "XfRABIFVEp");
        setBooleanField(term7380, term7380.getClass(), "isBlock", false);
        setBooleanField(term7380, term7380.getClass(), "formatAsBlock", false);
        setBooleanField(term7380, term7380.getClass(), "canContainInline", true);
        setBooleanField(term7380, term7380.getClass(), "empty", true);
        setBooleanField(term7380, term7380.getClass(), "selfClosing", true);
        setBooleanField(term7380, term7380.getClass(), "preserveWhitespace", true);
        setBooleanField(term7380, term7380.getClass(), "formList", false);
        setBooleanField(term7380, term7380.getClass(), "formSubmit", true);
        setField(term7379, term7379.getClass(), "tag", term7380);
        setField(term7401, term7401.getClass(), "referent", null);
        setField(term7402, term7402.getClass(), "lock", term7403);
        setField(term7402, term7402.getClass(), "head", null);
        setLongField(term7402, term7402.getClass(), "queueLength", 846579494941632714L);
        setField(term7401, term7401.getClass(), "queue", term7402);
        setField(term7401, term7401.getClass(), "next", null);
        setField(term7401, term7401.getClass(), "discovered", null);
        setField(term7379, term7379.getClass(), "shadowChildrenRef", term7401);
        setField(term7379, term7379.getClass(), "childNodes", term7405);
        setIntField(term7409, term7409.getClass(), "size", 842904495);
        setField(term7409, term7409.getClass(), "keys", term7411);
        setField(term7409, term7409.getClass(), "vals", term7412);
        setField(term7379, term7379.getClass(), "attributes", term7409);
        setField(term7379, term7379.getClass(), "baseUri", "MHGKyEnwKc");
        setField(term7379, term7379.getClass(), "parentNode", null);
        setIntField(term7379, term7379.getClass(), "siblingIndex", 1008080511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "toggleClass", argTypes, term7379, args);
    }

};


