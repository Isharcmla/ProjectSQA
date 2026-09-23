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

public class Element_val_24062387297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7468;

    public Element_val_24062387297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7494 = new ArrayList();
        ((ArrayList) term7494).add((Object)null);
        term7468 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7490 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7491 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7492 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7498 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7500 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7501 = (Object[]) newArray("java.lang.String", 0);
        setField(term7469, term7469.getClass(), "tagName", "IpQuOGMgmj");
        setBooleanField(term7469, term7469.getClass(), "isBlock", true);
        setBooleanField(term7469, term7469.getClass(), "formatAsBlock", false);
        setBooleanField(term7469, term7469.getClass(), "canContainInline", true);
        setBooleanField(term7469, term7469.getClass(), "empty", true);
        setBooleanField(term7469, term7469.getClass(), "selfClosing", true);
        setBooleanField(term7469, term7469.getClass(), "preserveWhitespace", false);
        setBooleanField(term7469, term7469.getClass(), "formList", true);
        setBooleanField(term7469, term7469.getClass(), "formSubmit", false);
        setField(term7468, term7468.getClass(), "tag", term7469);
        setField(term7490, term7490.getClass(), "referent", null);
        setField(term7491, term7491.getClass(), "lock", term7492);
        setField(term7491, term7491.getClass(), "head", null);
        setLongField(term7491, term7491.getClass(), "queueLength", 6689117472719450333L);
        setField(term7490, term7490.getClass(), "queue", term7491);
        setField(term7490, term7490.getClass(), "next", null);
        setField(term7490, term7490.getClass(), "discovered", null);
        setField(term7468, term7468.getClass(), "shadowChildrenRef", term7490);
        setField(term7468, term7468.getClass(), "childNodes", term7494);
        setIntField(term7498, term7498.getClass(), "size", 1935707624);
        setField(term7498, term7498.getClass(), "keys", term7500);
        setField(term7498, term7498.getClass(), "vals", term7501);
        setField(term7468, term7468.getClass(), "attributes", term7498);
        setField(term7468, term7468.getClass(), "baseUri", "pJbnHTYrxn");
        setField(term7468, term7468.getClass(), "parentNode", null);
        setIntField(term7468, term7468.getClass(), "siblingIndex", 1507074215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term7468, args);
    }

};


