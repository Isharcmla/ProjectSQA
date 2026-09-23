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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class FormElement_removeChild_5743446599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public FormElement_removeChild_5743446599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term397 = new ArrayList();
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        term355 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term356 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term357 = (Object[]) newArray("java.lang.Object", 0);
        Object term360 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term393 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term394 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term395 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term401 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term403 = (Object[]) newArray("java.lang.String", 0);
        Object[] term404 = (Object[]) newArray("java.lang.String", 0);
        setField(term356, term356.getClass(), "elementData", term357);
        setIntField(term356, term356.getClass(), "size", 0);
        setIntField(term356, term356.getClass(), "modCount", 0);
        setField(term355, term355.getClass(), "elements", term356);
        setField(term360, term360.getClass(), "tagName", "MxlszYVzRf");
        setField(term360, term360.getClass(), "normalName", "LQFpaHEwXR");
        setBooleanField(term360, term360.getClass(), "isBlock", true);
        setBooleanField(term360, term360.getClass(), "formatAsBlock", false);
        setBooleanField(term360, term360.getClass(), "canContainInline", true);
        setBooleanField(term360, term360.getClass(), "empty", true);
        setBooleanField(term360, term360.getClass(), "selfClosing", true);
        setBooleanField(term360, term360.getClass(), "preserveWhitespace", true);
        setBooleanField(term360, term360.getClass(), "formList", false);
        setBooleanField(term360, term360.getClass(), "formSubmit", false);
        setField(term355, term355.getClass(), "tag", term360);
        setField(term393, term393.getClass(), "referent", null);
        setField(term394, term394.getClass(), "lock", term395);
        setField(term394, term394.getClass(), "head", null);
        setLongField(term394, term394.getClass(), "queueLength", -8400487765614892086L);
        setField(term393, term393.getClass(), "queue", term394);
        setField(term393, term393.getClass(), "next", null);
        setField(term393, term393.getClass(), "discovered", null);
        setField(term355, term355.getClass(), "shadowChildrenRef", term393);
        setField(term355, term355.getClass(), "childNodes", term397);
        setIntField(term401, term401.getClass(), "size", -2038273078);
        setField(term401, term401.getClass(), "keys", term403);
        setField(term401, term401.getClass(), "vals", term404);
        setField(term355, term355.getClass(), "attributes", term401);
        setField(term355, term355.getClass(), "baseUri", "oVcInYnLWB");
        setField(term355, term355.getClass(), "parentNode", null);
        setIntField(term355, term355.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeChild", argTypes, term355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


