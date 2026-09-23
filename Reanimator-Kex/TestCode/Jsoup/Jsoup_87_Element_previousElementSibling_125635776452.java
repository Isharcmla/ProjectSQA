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

public class Element_previousElementSibling_125635776452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3736;

    public Element_previousElementSibling_125635776452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3762 = new ArrayList();
        ((ArrayList) term3762).add((Object)null);
        ((ArrayList) term3762).add((Object)null);
        ((ArrayList) term3762).add((Object)null);
        ((ArrayList) term3762).add((Object)null);
        term3736 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3737 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3758 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3759 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3760 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3766 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3768 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3769 = (Object[]) newArray("java.lang.String", 0);
        setField(term3737, term3737.getClass(), "tagName", "WzMEhMXkKx");
        setBooleanField(term3737, term3737.getClass(), "isBlock", true);
        setBooleanField(term3737, term3737.getClass(), "formatAsBlock", false);
        setBooleanField(term3737, term3737.getClass(), "canContainInline", false);
        setBooleanField(term3737, term3737.getClass(), "empty", false);
        setBooleanField(term3737, term3737.getClass(), "selfClosing", false);
        setBooleanField(term3737, term3737.getClass(), "preserveWhitespace", false);
        setBooleanField(term3737, term3737.getClass(), "formList", false);
        setBooleanField(term3737, term3737.getClass(), "formSubmit", true);
        setField(term3736, term3736.getClass(), "tag", term3737);
        setField(term3758, term3758.getClass(), "referent", null);
        setField(term3759, term3759.getClass(), "lock", term3760);
        setField(term3759, term3759.getClass(), "head", null);
        setLongField(term3759, term3759.getClass(), "queueLength", -5788180182343976541L);
        setField(term3758, term3758.getClass(), "queue", term3759);
        setField(term3758, term3758.getClass(), "next", null);
        setField(term3758, term3758.getClass(), "discovered", null);
        setField(term3736, term3736.getClass(), "shadowChildrenRef", term3758);
        setField(term3736, term3736.getClass(), "childNodes", term3762);
        setIntField(term3766, term3766.getClass(), "size", -268815336);
        setField(term3766, term3766.getClass(), "keys", term3768);
        setField(term3766, term3766.getClass(), "vals", term3769);
        setField(term3736, term3736.getClass(), "attributes", term3766);
        setField(term3736, term3736.getClass(), "baseUri", "XOiDvlDhdc");
        setField(term3736, term3736.getClass(), "parentNode", null);
        setIntField(term3736, term3736.getClass(), "siblingIndex", -1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "previousElementSibling", argTypes, term3736, args);
    }

};


