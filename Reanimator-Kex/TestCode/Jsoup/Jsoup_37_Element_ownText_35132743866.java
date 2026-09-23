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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_ownText_35132743866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6481;

    public Element_ownText_35132743866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6505 = new HashMap();
        Set<Object> term6560 =  ((Map) term6505).keySet();
        HashSet term6504 = new HashSet((Collection<? extends Object>) term6560);
        ArrayList term6521 = new ArrayList();
        ((ArrayList) term6521).add((Object)null);
        ((ArrayList) term6521).add((Object)null);
        ((ArrayList) term6521).add((Object)null);
        LinkedHashMap term6526 = new LinkedHashMap();
        term6481 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6482 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6525 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6482, term6482.getClass(), "tagName", "PtIjKpiSix");
        setBooleanField(term6482, term6482.getClass(), "isBlock", true);
        setBooleanField(term6482, term6482.getClass(), "formatAsBlock", false);
        setBooleanField(term6482, term6482.getClass(), "canContainBlock", true);
        setBooleanField(term6482, term6482.getClass(), "canContainInline", false);
        setBooleanField(term6482, term6482.getClass(), "empty", true);
        setBooleanField(term6482, term6482.getClass(), "selfClosing", true);
        setBooleanField(term6482, term6482.getClass(), "preserveWhitespace", false);
        setBooleanField(term6482, term6482.getClass(), "formList", true);
        setBooleanField(term6482, term6482.getClass(), "formSubmit", false);
        setField(term6481, term6481.getClass(), "tag", term6482);
        setField(term6481, term6481.getClass(), "classNames", term6504);
        setField(term6481, term6481.getClass(), "parentNode", null);
        setField(term6481, term6481.getClass(), "childNodes", term6521);
        setField(term6525, term6525.getClass(), "attributes", term6526);
        setField(term6481, term6481.getClass(), "attributes", term6525);
        setField(term6481, term6481.getClass(), "baseUri", "zyZTzHNjQr");
        setIntField(term6481, term6481.getClass(), "siblingIndex", -1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term6481, args);
    }

};


