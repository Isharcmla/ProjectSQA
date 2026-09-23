package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126257;

    public DOMNodePointer_createAttribute_149645840301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126369 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127265 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127601 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128049 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128385 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128497 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128609 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128833 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129057 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129953 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130289 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130737 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term130961 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131297 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131409 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132081 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132305 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132417 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132753 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term133089 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term133201 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term133313 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term126257, term126257.getClass(), "node", null);
        setField(term126257, term126257.getClass(), "id", null);
        setField(term126369, term126369.getClass(), "id", null);
        setField(term126481, term126481.getClass(), "id", null);
        setField(term126593, term126593.getClass(), "id", null);
        setField(term126705, term126705.getClass(), "id", null);
        setField(term126817, term126817.getClass(), "id", null);
        setField(term126929, term126929.getClass(), "id", null);
        setField(term127041, term127041.getClass(), "id", null);
        setField(term127153, term127153.getClass(), "id", null);
        setField(term127265, term127265.getClass(), "id", null);
        setField(term127377, term127377.getClass(), "id", null);
        setField(term127489, term127489.getClass(), "id", null);
        setField(term127601, term127601.getClass(), "id", null);
        setField(term127713, term127713.getClass(), "id", null);
        setField(term127825, term127825.getClass(), "id", null);
        setField(term127937, term127937.getClass(), "id", null);
        setField(term128049, term128049.getClass(), "id", null);
        setField(term128161, term128161.getClass(), "id", null);
        setField(term128273, term128273.getClass(), "id", null);
        setField(term128385, term128385.getClass(), "id", null);
        setField(term128497, term128497.getClass(), "id", null);
        setField(term128609, term128609.getClass(), "id", null);
        setField(term128721, term128721.getClass(), "id", null);
        setField(term128833, term128833.getClass(), "id", null);
        setField(term128945, term128945.getClass(), "id", null);
        setField(term129057, term129057.getClass(), "id", null);
        setField(term129169, term129169.getClass(), "id", null);
        setField(term129281, term129281.getClass(), "id", null);
        setField(term129393, term129393.getClass(), "id", null);
        setField(term129505, term129505.getClass(), "id", null);
        setField(term129617, term129617.getClass(), "id", null);
        setField(term129729, term129729.getClass(), "id", null);
        setField(term129841, term129841.getClass(), "id", null);
        setField(term129953, term129953.getClass(), "id", null);
        setField(term130065, term130065.getClass(), "id", null);
        setField(term130177, term130177.getClass(), "id", null);
        setField(term130289, term130289.getClass(), "id", null);
        setField(term130401, term130401.getClass(), "id", null);
        setField(term130513, term130513.getClass(), "id", null);
        setField(term130625, term130625.getClass(), "id", null);
        setField(term130737, term130737.getClass(), "id", null);
        setField(term130849, term130849.getClass(), "id", null);
        setField(term130961, term130961.getClass(), "id", null);
        setField(term131073, term131073.getClass(), "id", null);
        setField(term131185, term131185.getClass(), "id", null);
        setField(term131297, term131297.getClass(), "id", null);
        setField(term131409, term131409.getClass(), "id", null);
        setField(term131521, term131521.getClass(), "id", null);
        setField(term131633, term131633.getClass(), "id", null);
        setField(term131745, term131745.getClass(), "id", null);
        setField(term131857, term131857.getClass(), "id", null);
        setField(term131969, term131969.getClass(), "id", null);
        setField(term132081, term132081.getClass(), "id", null);
        setField(term132193, term132193.getClass(), "id", null);
        setField(term132305, term132305.getClass(), "id", null);
        setField(term132417, term132417.getClass(), "id", null);
        setField(term132529, term132529.getClass(), "id", null);
        setField(term132641, term132641.getClass(), "id", null);
        setField(term132753, term132753.getClass(), "id", null);
        setField(term132865, term132865.getClass(), "id", null);
        setField(term132977, term132977.getClass(), "id", null);
        setField(term133089, term133089.getClass(), "id", null);
        setField(term133201, term133201.getClass(), "id", null);
        setField(term133313, term133313.getClass(), "id", "");
        setField(term133201, term133201.getClass(), "parent", term133313);
        setField(term133089, term133089.getClass(), "parent", term133201);
        setField(term132977, term132977.getClass(), "parent", term133089);
        setField(term132865, term132865.getClass(), "parent", term132977);
        setField(term132753, term132753.getClass(), "parent", term132865);
        setField(term132641, term132641.getClass(), "parent", term132753);
        setField(term132529, term132529.getClass(), "parent", term132641);
        setField(term132417, term132417.getClass(), "parent", term132529);
        setField(term132305, term132305.getClass(), "parent", term132417);
        setField(term132193, term132193.getClass(), "parent", term132305);
        setField(term132081, term132081.getClass(), "parent", term132193);
        setField(term131969, term131969.getClass(), "parent", term132081);
        setField(term131857, term131857.getClass(), "parent", term131969);
        setField(term131745, term131745.getClass(), "parent", term131857);
        setField(term131633, term131633.getClass(), "parent", term131745);
        setField(term131521, term131521.getClass(), "parent", term131633);
        setField(term131409, term131409.getClass(), "parent", term131521);
        setField(term131297, term131297.getClass(), "parent", term131409);
        setField(term131185, term131185.getClass(), "parent", term131297);
        setField(term131073, term131073.getClass(), "parent", term131185);
        setField(term130961, term130961.getClass(), "parent", term131073);
        setField(term130849, term130849.getClass(), "parent", term130961);
        setField(term130737, term130737.getClass(), "parent", term130849);
        setField(term130625, term130625.getClass(), "parent", term130737);
        setField(term130513, term130513.getClass(), "parent", term130625);
        setField(term130401, term130401.getClass(), "parent", term130513);
        setField(term130289, term130289.getClass(), "parent", term130401);
        setField(term130177, term130177.getClass(), "parent", term130289);
        setField(term130065, term130065.getClass(), "parent", term130177);
        setField(term129953, term129953.getClass(), "parent", term130065);
        setField(term129841, term129841.getClass(), "parent", term129953);
        setField(term129729, term129729.getClass(), "parent", term129841);
        setField(term129617, term129617.getClass(), "parent", term129729);
        setField(term129505, term129505.getClass(), "parent", term129617);
        setField(term129393, term129393.getClass(), "parent", term129505);
        setField(term129281, term129281.getClass(), "parent", term129393);
        setField(term129169, term129169.getClass(), "parent", term129281);
        setField(term129057, term129057.getClass(), "parent", term129169);
        setField(term128945, term128945.getClass(), "parent", term129057);
        setField(term128833, term128833.getClass(), "parent", term128945);
        setField(term128721, term128721.getClass(), "parent", term128833);
        setField(term128609, term128609.getClass(), "parent", term128721);
        setField(term128497, term128497.getClass(), "parent", term128609);
        setField(term128385, term128385.getClass(), "parent", term128497);
        setField(term128273, term128273.getClass(), "parent", term128385);
        setField(term128161, term128161.getClass(), "parent", term128273);
        setField(term128049, term128049.getClass(), "parent", term128161);
        setField(term127937, term127937.getClass(), "parent", term128049);
        setField(term127825, term127825.getClass(), "parent", term127937);
        setField(term127713, term127713.getClass(), "parent", term127825);
        setField(term127601, term127601.getClass(), "parent", term127713);
        setField(term127489, term127489.getClass(), "parent", term127601);
        setField(term127377, term127377.getClass(), "parent", term127489);
        setField(term127265, term127265.getClass(), "parent", term127377);
        setField(term127153, term127153.getClass(), "parent", term127265);
        setField(term127041, term127041.getClass(), "parent", term127153);
        setField(term126929, term126929.getClass(), "parent", term127041);
        setField(term126817, term126817.getClass(), "parent", term126929);
        setField(term126705, term126705.getClass(), "parent", term126817);
        setField(term126593, term126593.getClass(), "parent", term126705);
        setField(term126481, term126481.getClass(), "parent", term126593);
        setField(term126369, term126369.getClass(), "parent", term126481);
        setField(term126257, term126257.getClass(), "parent", term126369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createAttribute", argTypes, term126257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


