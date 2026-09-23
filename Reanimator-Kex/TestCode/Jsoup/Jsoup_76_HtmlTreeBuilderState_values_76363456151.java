package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilderState_values_76363456151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46127;

    public HtmlTreeBuilderState_values_76363456151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46450 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46449 = ((Class) term46450).getDeclaredField((String) "Initial");
        ((Field) term46449).setAccessible(true);
        Object enum100 = ((Field) term46449).get((Object) null);
        Class<? extends Object> term46663 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46662 = ((Class) term46663).getDeclaredField((String) "BeforeHtml");
        ((Field) term46662).setAccessible(true);
        Object enum101 = ((Field) term46662).get((Object) null);
        Class<? extends Object> term46885 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46884 = ((Class) term46885).getDeclaredField((String) "BeforeHead");
        ((Field) term46884).setAccessible(true);
        Object enum102 = ((Field) term46884).get((Object) null);
        Class<? extends Object> term47107 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47106 = ((Class) term47107).getDeclaredField((String) "InHead");
        ((Field) term47106).setAccessible(true);
        Object enum103 = ((Field) term47106).get((Object) null);
        Class<? extends Object> term47317 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47316 = ((Class) term47317).getDeclaredField((String) "InHeadNoscript");
        ((Field) term47316).setAccessible(true);
        Object enum104 = ((Field) term47316).get((Object) null);
        Class<? extends Object> term47551 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47550 = ((Class) term47551).getDeclaredField((String) "AfterHead");
        ((Field) term47550).setAccessible(true);
        Object enum105 = ((Field) term47550).get((Object) null);
        Class<? extends Object> term47770 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47769 = ((Class) term47770).getDeclaredField((String) "InBody");
        ((Field) term47769).setAccessible(true);
        Object enum106 = ((Field) term47769).get((Object) null);
        Class<? extends Object> term47980 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47979 = ((Class) term47980).getDeclaredField((String) "Text");
        ((Field) term47979).setAccessible(true);
        Object enum107 = ((Field) term47979).get((Object) null);
        Class<? extends Object> term48184 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48183 = ((Class) term48184).getDeclaredField((String) "InTable");
        ((Field) term48183).setAccessible(true);
        Object enum108 = ((Field) term48183).get((Object) null);
        Class<? extends Object> term48397 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48396 = ((Class) term48397).getDeclaredField((String) "InTableText");
        ((Field) term48396).setAccessible(true);
        Object enum109 = ((Field) term48396).get((Object) null);
        Class<? extends Object> term48622 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48621 = ((Class) term48622).getDeclaredField((String) "InCaption");
        ((Field) term48621).setAccessible(true);
        Object enum110 = ((Field) term48621).get((Object) null);
        Class<? extends Object> term48841 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48840 = ((Class) term48841).getDeclaredField((String) "InColumnGroup");
        ((Field) term48840).setAccessible(true);
        Object enum111 = ((Field) term48840).get((Object) null);
        Class<? extends Object> term49072 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49071 = ((Class) term49072).getDeclaredField((String) "InTableBody");
        ((Field) term49071).setAccessible(true);
        Object enum112 = ((Field) term49071).get((Object) null);
        Class<? extends Object> term49297 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49296 = ((Class) term49297).getDeclaredField((String) "InRow");
        ((Field) term49296).setAccessible(true);
        Object enum113 = ((Field) term49296).get((Object) null);
        Class<? extends Object> term49504 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49503 = ((Class) term49504).getDeclaredField((String) "InCell");
        ((Field) term49503).setAccessible(true);
        Object enum114 = ((Field) term49503).get((Object) null);
        Class<? extends Object> term49714 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49713 = ((Class) term49714).getDeclaredField((String) "InSelect");
        ((Field) term49713).setAccessible(true);
        Object enum115 = ((Field) term49713).get((Object) null);
        Class<? extends Object> term49930 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49929 = ((Class) term49930).getDeclaredField((String) "InSelectInTable");
        ((Field) term49929).setAccessible(true);
        Object enum116 = ((Field) term49929).get((Object) null);
        Class<? extends Object> term50167 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50166 = ((Class) term50167).getDeclaredField((String) "AfterBody");
        ((Field) term50166).setAccessible(true);
        Object enum117 = ((Field) term50166).get((Object) null);
        Class<? extends Object> term50386 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50385 = ((Class) term50386).getDeclaredField((String) "InFrameset");
        ((Field) term50385).setAccessible(true);
        Object enum118 = ((Field) term50385).get((Object) null);
        Class<? extends Object> term50608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50607 = ((Class) term50608).getDeclaredField((String) "AfterFrameset");
        ((Field) term50607).setAccessible(true);
        Object enum119 = ((Field) term50607).get((Object) null);
        Class<? extends Object> term50839 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50838 = ((Class) term50839).getDeclaredField((String) "AfterAfterBody");
        ((Field) term50838).setAccessible(true);
        Object enum120 = ((Field) term50838).get((Object) null);
        Class<? extends Object> term51073 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51072 = ((Class) term51073).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term51072).setAccessible(true);
        Object enum121 = ((Field) term51072).get((Object) null);
        Class<? extends Object> term51319 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51318 = ((Class) term51319).getDeclaredField((String) "ForeignContent");
        ((Field) term51318).setAccessible(true);
        Object enum122 = ((Field) term51318).get((Object) null);
        term46127 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term46127, 0, enum100);
        setElement(term46127, 1, enum101);
        setElement(term46127, 2, enum102);
        setElement(term46127, 3, enum103);
        setElement(term46127, 4, enum104);
        setElement(term46127, 5, enum105);
        setElement(term46127, 6, enum106);
        setElement(term46127, 7, enum107);
        setElement(term46127, 8, enum108);
        setElement(term46127, 9, enum109);
        setElement(term46127, 10, enum110);
        setElement(term46127, 11, enum111);
        setElement(term46127, 12, enum112);
        setElement(term46127, 13, enum113);
        setElement(term46127, 14, enum114);
        setElement(term46127, 15, enum115);
        setElement(term46127, 16, enum116);
        setElement(term46127, 17, enum117);
        setElement(term46127, 18, enum118);
        setElement(term46127, 19, enum119);
        setElement(term46127, 20, enum120);
        setElement(term46127, 21, enum121);
        setElement(term46127, 22, enum122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term46127));
    }

};


